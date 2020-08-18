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
import mx.com.iscrivera.report.model.Detailedreport;
import mx.com.iscrivera.report.model.FlawType;
import mx.com.iscrivera.report.model.SeverityType;

public class ReportUtil {
	private static final Logger LOG = Logger.getLogger(ReportUtil.class);

	private ReportUtil() {
		super();
	}

	public static Detailedreport getDataReport(String inputFile) throws JAXBException {
		LOG.debug("Getting data from file: " + inputFile);
		File file = new File(inputFile);
		JAXBContext jaxbContext = JAXBContext.newInstance(Detailedreport.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		return (Detailedreport) unmarshaller.unmarshal(file);
	}

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

		// Create Headers
		rowIndex += 2;
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
			int countSeverity = 0;
			for (CategoryType category : severity.getCategory()) {
				for (CweType cwe : category.getCwe()) {
					for (FlawType flaw : cwe.getStaticflaws().getFlaw()) {
						countSeverity++;
						countFlaws++;
						rowIndex++;
						HSSFRow flawRow = sheet.createRow(rowIndex);
						HSSFCell cellFlaw = flawRow.createCell(1);
						cellFlaw.setCellStyle(severityStyle);
						cellFlaw.setCellValue(countFlaws);

						cellFlaw = flawRow.createCell(2);
						cellFlaw.setCellStyle(severityStyle);
						cellFlaw.setCellFormula(String.format(ReportConstants.FORMAT_FORMULA_HRS,
								ReportConstants.EFFORT_LIST.get(flaw.getRemediationeffort() - 1).getHrs(),
								cwe.getStaticflaws().getFlaw().size()));

						cellFlaw = flawRow.createCell(3);
						cellFlaw.setCellStyle(severityStyle);
						cellFlaw.setCellValue(flaw.getIssueid().toString());

						cellFlaw = flawRow.createCell(4);
						cellFlaw.setCellStyle(severityStyle);
						cellFlaw.setCellValue(ReportConstants.SEVERITY_DESC.get(severity.getLevel()));

						cellFlaw = flawRow.createCell(5);
						cellFlaw.setCellStyle(severityStyle);
						cellFlaw.setCellValue(flaw.getModule());

						cellFlaw = flawRow.createCell(6);
						cellFlaw.setCellStyle(severityStyle);
						cellFlaw.setCellValue(flaw.getSourcefilepath());

						cellFlaw = flawRow.createCell(7);
						cellFlaw.setCellStyle(severityStyle);
						cellFlaw.setCellValue(flaw.getSourcefile());

						cellFlaw = flawRow.createCell(8);
						cellFlaw.setCellStyle(severityStyle);
						cellFlaw.setCellValue(flaw.getLine().toString());

						cellFlaw = flawRow.createCell(9);
						cellFlaw.setCellStyle(severityStyle);
						cellFlaw.setCellValue(
								ReportConstants.EFFORT_LIST.get(flaw.getRemediationeffort() - 1).getDesc());

						cellFlaw = flawRow.createCell(10);
						cellFlaw.setCellStyle(severityStyle);
						cellFlaw.setCellValue(category.getCategoryname());

						cellFlaw = flawRow.createCell(11);
						cellFlaw.setCellStyle(severityStyle);
						cellFlaw.setCellValue(cwe.getCweid().toString());

						cellFlaw = flawRow.createCell(12);
						cellFlaw.setCellStyle(severityStyle);
						cellFlaw.setCellValue(flaw.getCategoryname());

						cellFlaw = flawRow.createCell(13);
						sheet.setColumnWidth(13, 18000);
						severityStyle.setWrapText(true);
						cellFlaw.setCellStyle(severityStyle);
						cellFlaw.setCellValue(flaw.getDescription());

						cellFlaw = flawRow.createCell(14);
						severityStyle.setWrapText(false);
						cellFlaw.setCellStyle(severityStyle);
						cellFlaw.setCellValue(flaw.getExploitDesc());

						cellFlaw = flawRow.createCell(15);
						cellFlaw.setCellStyle(severityStyle);

						cellFlaw = flawRow.createCell(16);
						cellFlaw.setCellStyle(severityStyle);
					}
				}
			}

			HSSFCell cellCount = severityRow.createCell(5);
			cellCount.setCellStyle(severityStyle);
			cellCount.setCellValue(countSeverity);
			severityRowIndex++;
		}

		headerIndex = 1;
		while (headerIndex <= ReportConstants.HEADERS_DESC.size()) {
			sheet.autoSizeColumn(headerIndex);
			headerIndex++;
		}

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

		FileOutputStream file = new FileOutputStream(outputFile);
		workbook.write(file);
		file.close();
	}

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
