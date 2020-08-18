package mx.com.iscrivera.report.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EffortModel {

	private Integer effortId;
	private String desc;
	private Double hrs;
}
