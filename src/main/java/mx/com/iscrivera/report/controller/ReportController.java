package mx.com.iscrivera.report.controller;

import java.io.IOException;
import java.math.BigInteger;

import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;

import mx.com.iscrivera.report.constants.ReportConstants;
import mx.com.iscrivera.report.model.Detailedreport;
import mx.com.iscrivera.report.util.ReportUtil;

public class ReportController {

	private static final Logger LOG = Logger.getLogger(ReportController.class);

	public static void getReportExcel(String[] args) {
		LOG.debug("Start getReportExcel");
		String inputFile = ReportConstants.DEFAULT_INPUT_FILE;
		String outputFile = ReportConstants.DEFAULT_OUTPUT_FILE;
		if (args.length > BigInteger.ONE.intValue()) {
			inputFile = args[0];
			outputFile = args[1];
		}
		Detailedreport dataReport;
		try {
			dataReport = ReportUtil.getDataReport(inputFile);
			ReportUtil.createExcelDataReport(dataReport, outputFile);
		} catch (JAXBException e) {
			LOG.error("Was not possible read the inputfile: ", e);
		} catch (IOException e) {
			LOG.error("Was not possible create the outputfile: ", e);
		}
		LOG.debug("End getReportExcel");
	}

}
