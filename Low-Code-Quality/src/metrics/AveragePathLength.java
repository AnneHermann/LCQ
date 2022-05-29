package metrics;

import AlleKnotenFormartiert.NodeSystemType;
import report.MetricResponse;
import report.QualityReportResponse;

public class AveragePathLength implements IMetric {

	private static final String DURCHSCHNITTLICHE_PFADLÄNGE = "Durchschnittliche Pfadlänge";

	@Override
	public void Calculate(NodeSystemType nodeSystem, QualityReportResponse response) {
		var pathCalculator = new PathCalculator(nodeSystem);

		response.AddMetricResponse(new MetricResponse(DURCHSCHNITTLICHE_PFADLÄNGE,
				Double.toString(pathCalculator.getAveragePathLength())));
	}

}
