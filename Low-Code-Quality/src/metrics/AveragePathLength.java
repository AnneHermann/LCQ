package metrics;

import AlleKnotenFormartiert.DocumentRoot;
import report.MetricResponse;
import report.QualityReportResponse;

public class AveragePathLength implements IMetric {

	private static final String DURCHSCHNITTLICHE_PFADLÄNGE = "Durchschnittliche Pfadlänge";

	@Override
	public void Calculate(DocumentRoot documentRoot, QualityReportResponse response) {
		var pathCalculator = new PathCalculator(documentRoot.getNodeSystem());

		response.AddMetricResponse(new MetricResponse(DURCHSCHNITTLICHE_PFADLÄNGE,
				Double.toString(pathCalculator.getAveragePathLength())));

	}

}
