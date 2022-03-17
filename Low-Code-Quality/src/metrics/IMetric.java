package metrics;

import BspKnotensystem.DocumentRoot;
import report.QualityReportResponse;

public interface IMetric {

	public void calculate(DocumentRoot documentRoot, QualityReportResponse response);

}
