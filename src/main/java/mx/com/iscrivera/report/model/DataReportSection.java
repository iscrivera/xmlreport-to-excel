package mx.com.iscrivera.report.model;

import org.apache.poi.ss.usermodel.CellStyle;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DataReportSection {

	private int rowIndex;
	private int countFlaws;
	private SeverityType severity;
	private CellStyle severityStyle;
	private CellStyle severityStyleDescription;
	private CategoryType category;
	private CweType cwe;
	private FlawType flaw;

}
