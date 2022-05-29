package metrics;

import AlleKnotenFormartiert.NodeSystemType;
import report.QualityReportResponse;

public interface IMetric {

	public void Calculate(NodeSystemType nodeSystem, QualityReportResponse response);

}
