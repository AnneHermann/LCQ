package metrics;

import AlleKnotenFormartiert.DocumentRoot;
import report.QualityReportResponse;

public interface IMetric {

	public void Calculate(DocumentRoot documentRoot, QualityReportResponse response);

}
