package metrics;

import AlleKnotenFormartiert.DocumentRoot;
import report.MetricResponse;
import report.QualityReportResponse;


public class NumberOfNodes implements IMetric {


	private static final String ANZAHL_DER_KNOTEN = "Anzahl der Knoten";

	public void Calculate(DocumentRoot documentRoot, QualityReportResponse response) {
		var nodeSystem = documentRoot.getNodeSystem();
	    var numberOfFunctionalNodes = nodeSystem.getNodes().size();
	    var numberOfSources = nodeSystem.getSources().size();
	    var numberOfResults = nodeSystem.getResults().size();
	    var numberOfNodes = numberOfFunctionalNodes + numberOfSources + numberOfResults;
	    
	    response.AddMetricResponse(new MetricResponse(ANZAHL_DER_KNOTEN, Integer.toString(numberOfNodes)));
	}

}
