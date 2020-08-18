package mx.com.iscrivera.report.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;

import mx.com.iscrivera.report.constants.ReportConstants;
import mx.com.iscrivera.report.model.CategoryType;
import mx.com.iscrivera.report.model.CweType;
import mx.com.iscrivera.report.model.DataReportSection;
import mx.com.iscrivera.report.model.Detailedreport;
import mx.com.iscrivera.report.model.FlawType;
import mx.com.iscrivera.report.model.SeverityType;

public class ReportUtil {
	private static final Logger LOG = Logger.getLogger(ReportUtil.class);

	private ReportUtil() {
		super();
	}

	/**
	 * 
	 * @param inputFile
	 * @return
	 * @throws JAXBException
	 */
	public static Detailedreport getDataReport(String inputFile) throws JAXBException {
		LOG.debug("Getting data from file: " + inputFile);
		File file = new File(inputFile);
		JAXBContext jaxbContext = JAXBContext.newInstance(Detailedreport.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		return (Detailedreport) unmarshaller.unmarshal(file);
	}

	/**
	 * 
	 * @param dataReport
	 * @param outputFile
	 * @throws IOException
	 */
	public static void createExcelDataReport(Detailedreport dataReport, String outputFile) throws IOException {
		LOG.debug("Generating report inside file: " + outputFile);
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet();
		workbook.setSheetName(0, ReportConstants.SHEET_NAME);

		// Styles
		CellStyle titleStyle = StyleUtil.createTitleStyle(workbook);
		CellStyle titleDescStyle = StyleUtil.createTitleDescStyle(workbook);

		// Create Title
		int rowIndex = 1;
		rowIndex = createTitleSection(dataReport, sheet, titleStyle, titleDescStyle, rowIndex);

		// Create Headers
		rowIndex += 2;
		createHeadersSection(sheet, titleStyle, rowIndex);

		// Create Info
		int severityRowIndex = BigInteger.ONE.intValue();
		int countFlaws = 0;
		List<SeverityType> severities = dataReport.getSeverity();
		Collections.reverse(severities);
		for (SeverityType severity : severities) {
			HSSFRow severityRow = sheet.getRow(severityRowIndex) != null ? sheet.getRow(severityRowIndex)
					: sheet.createRow(severityRowIndex);
			severityRow.setHeightInPoints(24);
			HSSFCell cell = severityRow.createCell(4);
			CellStyle severityStyle = StyleUtil.getSeverityStyle(severity.getLevel(), workbook);
			cell.setCellStyle(severityStyle);
			cell.setCellValue(ReportConstants.SEVERITY_DESC.get(severity.getLevel()));
			CellStyle severityStyleDescription = StyleUtil.getSeverityStyle(severity.getLevel(), workbook);
			int countSeverity = 0;
			for (CategoryType category : severity.getCategory()) {
				for (CweType cwe : category.getCwe()) {
					for (FlawType flaw : cwe.getStaticflaws().getFlaw()) {
						countSeverity++;
						countFlaws++;
						rowIndex++;
						createDataSection(sheet, new DataReportSection(rowIndex, countFlaws, severity, severityStyle,
								severityStyleDescription, category, cwe, flaw));
					}
				}
			}

			HSSFCell cellCount = severityRow.createCell(5);
			cellCount.setCellStyle(severityStyle);
			cellCount.setCellValue(countSeverity);
			severityRowIndex++;
		}

		setAutosizeColumn(sheet);
		createTotalData(sheet, titleDescStyle, rowIndex);

		FileOutputStream file = new FileOutputStream(outputFile);
		workbook.write(file);
		file.close();
	}

	/**
	 * @param sheet
	 */
	private static void setAutosizeColumn(HSSFSheet sheet) {
		int headerIndex;
		headerIndex = 1;
		while (headerIndex <= ReportConstants.HEADERS_DESC.size()) {
			sheet.autoSizeColumn(headerIndex);
			headerIndex++;
		}
	}

	/**
	 * @param sheet
	 * @param titleDescStyle
	 * @param rowIndex
	 */
	private static void createTotalData(HSSFSheet sheet, CellStyle titleDescStyle, int rowIndex) {
		// Set Total Hrs
		HSSFRow totalRow = sheet.getRow(6);
		HSSFCell cellTotal = totalRow.getCell(2);
		cellTotal.setCellStyle(titleDescStyle);
		cellTotal.setCellFormula(String.format(ReportConstants.FORMAT_FORMULA_TOTAL_HRS, rowIndex + 1));

		// Set TotalFlaws
		HSSFRow totalFlawRow = sheet.getRow(2);
		HSSFCell cellTotalFlaw = totalFlawRow.getCell(2);
		cellTotalFlaw.setCellStyle(titleDescStyle);
		cellTotalFlaw.setCellFormula(ReportConstants.FORMAT_FORMULA_TOTAL_FLAWS);
	}

	/**
	 * @param sheet
	 * @param rowIndex
	 * @param countFlaws
	 * @param severity
	 * @param severityStyle
	 * @param severityStyleDescription
	 * @param category
	 * @param cwe
	 * @param flaw
	 */
	private static void createDataSection(HSSFSheet sheet, DataReportSection data) {
		HSSFRow flawRow = sheet.createRow(data.getRowIndex());
		HSSFCell cellFlaw = flawRow.createCell(1);
		cellFlaw.setCellStyle(data.getSeverityStyle());
		cellFlaw.setCellValue(data.getCountFlaws());

		cellFlaw = flawRow.createCell(2);
		cellFlaw.setCellStyle(data.getSeverityStyle());
		cellFlaw.setCellFormula(String.format(ReportConstants.FORMAT_FORMULA_HRS,
				ReportConstants.EFFORT_LIST.get(data.getFlaw().getRemediationeffort() - 1).getHrs(),
				data.getCwe().getStaticflaws().getFlaw().size()));

		cellFlaw = flawRow.createCell(3);
		cellFlaw.setCellStyle(data.getSeverityStyle());
		cellFlaw.setCellValue(data.getFlaw().getIssueid().toString());

		cellFlaw = flawRow.createCell(4);
		cellFlaw.setCellStyle(data.getSeverityStyle());
		cellFlaw.setCellValue(ReportConstants.SEVERITY_DESC.get(data.getSeverity().getLevel()));

		cellFlaw = flawRow.createCell(5);
		cellFlaw.setCellStyle(data.getSeverityStyle());
		cellFlaw.setCellValue(data.getFlaw().getModule());

		cellFlaw = flawRow.createCell(6);
		cellFlaw.setCellStyle(data.getSeverityStyle());
		cellFlaw.setCellValue(data.getFlaw().getSourcefilepath());

		cellFlaw = flawRow.createCell(7);
		cellFlaw.setCellStyle(data.getSeverityStyle());
		cellFlaw.setCellValue(data.getFlaw().getSourcefile());

		cellFlaw = flawRow.createCell(8);
		cellFlaw.setCellStyle(data.getSeverityStyle());
		cellFlaw.setCellValue(data.getFlaw().getLine().toString());

		cellFlaw = flawRow.createCell(9);
		cellFlaw.setCellStyle(data.getSeverityStyle());
		cellFlaw.setCellValue(ReportConstants.EFFORT_LIST.get(data.getFlaw().getRemediationeffort() - 1).getDesc());

		cellFlaw = flawRow.createCell(10);
		cellFlaw.setCellStyle(data.getSeverityStyle());
		cellFlaw.setCellValue(data.getCategory().getCategoryname());

		cellFlaw = flawRow.createCell(11);
		cellFlaw.setCellStyle(data.getSeverityStyle());
		cellFlaw.setCellValue(data.getCwe().getCweid().toString());

		cellFlaw = flawRow.createCell(12);
		cellFlaw.setCellStyle(data.getSeverityStyle());
		cellFlaw.setCellValue(data.getFlaw().getCategoryname());

		cellFlaw = flawRow.createCell(13);
		sheet.setColumnWidth(13, 18000);
		data.getSeverityStyleDescription().setWrapText(true);
		cellFlaw.setCellStyle(data.getSeverityStyleDescription());
		cellFlaw.setCellValue(data.getFlaw().getDescription());

		cellFlaw = flawRow.createCell(14);
		cellFlaw.setCellStyle(data.getSeverityStyle());
		cellFlaw.setCellValue(data.getFlaw().getExploitDesc());

		cellFlaw = flawRow.createCell(15);
		cellFlaw.setCellStyle(data.getSeverityStyle());

		cellFlaw = flawRow.createCell(16);
		cellFlaw.setCellStyle(data.getSeverityStyle());
	}

	/**
	 * @param sheet
	 * @param titleStyle
	 * @param rowIndex
	 */
	private static void createHeadersSection(HSSFSheet sheet, CellStyle titleStyle, int rowIndex) {
		HSSFRow headerRow = sheet.createRow(rowIndex);
		headerRow.setHeightInPoints(24);
		int headerIndex = 1;
		for (String header : ReportConstants.HEADERS_DESC) {
			HSSFCell cell = headerRow.createCell(headerIndex);
			cell.setCellStyle(titleStyle);
			cell.setCellValue(header);
			sheet.autoSizeColumn(headerIndex);
			headerIndex++;
		}
	}

	/**
	 * @param dataReport
	 * @param sheet
	 * @param titleStyle
	 * @param titleDescStyle
	 * @param rowIndex
	 * @return
	 */
	private static int createTitleSection(Detailedreport dataReport, HSSFSheet sheet, CellStyle titleStyle,
			CellStyle titleDescStyle, int rowIndex) {
		for (String title : ReportConstants.TITLES_DESC) {
			HSSFRow titleRow = sheet.createRow(rowIndex);
			titleRow.setHeightInPoints(24);
			HSSFCell cell = titleRow.createCell(1);
			cell.setCellStyle(titleStyle);
			cell.setCellValue(title);
			HSSFCell cellDesc = titleRow.createCell(2);
			cellDesc.setCellStyle(titleDescStyle);
			cellDesc.setCellValue(getValueTitle(rowIndex, dataReport));
			sheet.autoSizeColumn(1);
			sheet.autoSizeColumn(2);
			rowIndex++;
		}
		return rowIndex;
	}

	/**
	 * 
	 * @param start
	 * @param dataReport
	 * @return
	 */
	private static String getValueTitle(int start, Detailedreport dataReport) {
		String value = "";
		switch (start) {
		case 1:
			value = dataReport.getAppName();
			break;
		case 2:
			break;
		case 3:
			value = dataReport.getStaticAnalysis().getScore().toString();
			break;
		case 4:
			value = dataReport.getVersion();
			break;
		case 5:
			value = ReportConstants.PERCENTAGE_VARIATION.toString();
			break;
		default:
			break;
		}
		return value;
	}

}
