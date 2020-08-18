package mx.com.iscrivera.report.util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;

import mx.com.iscrivera.report.constants.ReportConstants;

public class StyleUtil {

	private StyleUtil() {
		super();
	}

	/**
	 * 
	 * @param workbook
	 * @return
	 */
	public static CellStyle createTitleStyle(HSSFWorkbook workbook) {
		CellStyle titleStyle = workbook.createCellStyle();
		Font font = workbook.createFont();
		font.setBold(true);
		font.setFontHeightInPoints((short) 13);
		font.setFontName(ReportConstants.FONT_FAMILY);
		titleStyle.setFont(font);
		titleStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
		titleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		titleStyle.setVerticalAlignment(VerticalAlignment.CENTER);
		allBorders(titleStyle);
		return titleStyle;
	}

	/**
	 * 
	 * @param workbook
	 * @return
	 */
	public static CellStyle createTitleDescStyle(HSSFWorkbook workbook) {
		CellStyle titleDescStyle = workbook.createCellStyle();
		Font font = workbook.createFont();
		font.setBold(true);
		font.setFontHeightInPoints((short) 11);
		font.setFontName(ReportConstants.FONT_FAMILY);
		font.setColor(IndexedColors.WHITE.getIndex());
		titleDescStyle.setFont(font);
		titleDescStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
		titleDescStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		titleDescStyle.setVerticalAlignment(VerticalAlignment.CENTER);
		titleDescStyle.setAlignment(HorizontalAlignment.LEFT);
		allBorders(titleDescStyle);
		return titleDescStyle;
	}

	/**
	 * 
	 * @param workbook
	 * @return
	 */
	public static CellStyle createCellStyle(HSSFWorkbook workbook) {
		CellStyle style = workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		return style;
	}

	/**
	 * 
	 * @param workbook
	 * @return
	 */
	public static CellStyle createHeaderStyle(HSSFWorkbook workbook) {
		CellStyle headerStyle = workbook.createCellStyle();
		Font font = workbook.createFont();
		font.setBold(true);
		headerStyle.setFont(font);
		return headerStyle;
	}

	/**
	 * 
	 * @param level
	 * @param workbook
	 * @return
	 */
	public static CellStyle getSeverityStyle(int level, HSSFWorkbook workbook) {
		CellStyle severityStyle = workbook.createCellStyle();
		Font font = workbook.createFont();
		font.setFontHeightInPoints((short) 11);
		font.setFontName(ReportConstants.FONT_FAMILY);
		font.setColor(level >= 4 ? IndexedColors.WHITE.getIndex() : IndexedColors.BLACK.getIndex());
		severityStyle.setFont(font);
		severityStyle.setFillForegroundColor(getIndexedColorBySeverity(level));
		severityStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		severityStyle.setVerticalAlignment(VerticalAlignment.CENTER);
		allBorders(severityStyle);
		return severityStyle;
	}

	/**
	 * 
	 * @param level
	 * @return
	 */
	private static short getIndexedColorBySeverity(int level) {
		short index = 0;
		switch (level) {
		case 0:
			index = IndexedColors.LIGHT_GREEN.getIndex();
			break;
		case 1:
			index = IndexedColors.LIGHT_TURQUOISE.getIndex();
			break;
		case 2:
			index = IndexedColors.LIGHT_YELLOW.getIndex();
			break;
		case 3:
			index = IndexedColors.TAN.getIndex();
			break;
		case 4:
			index = IndexedColors.DARK_RED.getIndex();
			break;
		default:
			index = IndexedColors.VIOLET.getIndex();
			break;
		}
		return index;
	}

	/**
	 * 
	 * @param severityStyle
	 */
	private static void allBorders(CellStyle severityStyle) {
		severityStyle.setBorderBottom(BorderStyle.THIN);
		severityStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());
		severityStyle.setBorderRight(BorderStyle.THIN);
		severityStyle.setRightBorderColor(IndexedColors.BLACK.getIndex());
		severityStyle.setBorderTop(BorderStyle.THIN);
		severityStyle.setLeftBorderColor(IndexedColors.BLACK.getIndex());
		severityStyle.setBorderLeft(BorderStyle.THIN);
		severityStyle.setTopBorderColor(IndexedColors.BLACK.getIndex());
	}

	/**
	 * 
	 * @param level
	 * @param workbook
	 * @return
	 */
	public static CellStyle getHrsSeverityStyle(int level, HSSFWorkbook workbook) {
		CellStyle severityStyle = workbook.createCellStyle();
		Font font = workbook.createFont();
		font.setBold(true);
		font.setFontHeightInPoints((short) 11);
		font.setFontName(ReportConstants.FONT_FAMILY);
		font.setColor(level >= 4 ? IndexedColors.WHITE.getIndex() : IndexedColors.BLACK.getIndex());
		severityStyle.setFont(font);
		severityStyle.setFillForegroundColor(getIndexedColorBySeverity(level));
		severityStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		severityStyle.setVerticalAlignment(VerticalAlignment.CENTER);
		severityStyle.setAlignment(HorizontalAlignment.CENTER);
		allBorders(severityStyle);
		return severityStyle;
	}

}
