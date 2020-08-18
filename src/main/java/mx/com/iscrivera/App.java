package mx.com.iscrivera;

import mx.com.iscrivera.report.controller.ReportController;

/**
 * App to get veracode report in excel file
 * 
 * @author C262780
 *
 */
public class App {

	public static void main(String[] args) {
		ReportController.getReportExcel(args);
	}
}
