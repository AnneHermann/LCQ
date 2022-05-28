package metrics;

import AlleKnotenFormartiert.DocumentRoot;
import report.MetricResponse;
import report.QualityReportResponse;

public class AveragePathLength implements IMetric {

	private static final String DURCHSCHNITTLICHE_PFADL�NGE = "Durchschnittliche Pfadl�nge";

	@Override
	public void Calculate(DocumentRoot documentRoot, QualityReportResponse response) {
		var pathCalculator = new PathCalculator(documentRoot.getNodeSystem());

		response.AddMetricResponse(new MetricResponse(DURCHSCHNITTLICHE_PFADL�NGE,
				Double.toString(pathCalculator.getAveragePathLength())));

	}

}
