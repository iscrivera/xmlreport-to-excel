package mx.com.iscrivera.report.constants;

import java.util.Arrays;
import java.util.List;

import mx.com.iscrivera.report.model.EffortModel;

public class ReportConstants {

	private ReportConstants() {
		super();
	}

	public static final List<String> SEVERITY_DESC = Arrays.asList("Info", "Very Low", "Low", "Medium", "High",
			"Very High");

	public static final List<String> TITLES_DESC = Arrays.asList("Application:", "Total Flaws:", "Score:", "Version:",
			"Percentage Variation %:", "Total Estimated Hrs:");

	public static final List<EffortModel> EFFORT_LIST = Arrays.asList(
			new EffortModel(1,
					"1 - Trivial implementation error. Fix is up to 5 lines of code. One hour or less to fix.", 1D),
			new EffortModel(2, "2 - Implementation error. Fix is approx. 6-50 lines of code. 1 day to fix.", 8D),
			new EffortModel(3,
					"3 - Complex implementation error. Fix is approx. 51-500 lines of code. Up to 5 days to fix.", 40D),
			new EffortModel(4, "4 - Simple design error. Requires redesign and up to 5 days to fix.", 40D),
			new EffortModel(5, "5 - Complex design error. Requires significant redesign.", 80D));

	public static final List<String> HEADERS_DESC = Arrays.asList("Number", "Estimated hrs", "Flaw Id", "Severity", "Module",
			"Source Path", "Source File", "Line", "Effort Descripion", "General Problem", "CWEID",
			"Details Problem", "Description Problem", "Function", "Accountable", "Responsible");

	public static final Integer PERCENTAGE_VARIATION = 20;

	public static final String SHEET_NAME = "Veracode Effort Estimation";
	public static final String FONT_FAMILY = "Leelawadee UI";

	public static final String FORMAT_FORMULA_HRS = "ROUND(((%s/%s)*(1+(C6/100))),1)";	

	public static final String FORMAT_FORMULA_TOTAL_HRS = "SUM(C11:C%d)";

	public static final String FORMAT_FORMULA_TOTAL_FLAWS = "SUM(F2:F7)";
	public static final String DEFAULT_OUTPUT_FILE = "detailVeracodeReport.xls";
	public static final String DEFAULT_INPUT_FILE = "detailVeracodeReport.xml";
}
