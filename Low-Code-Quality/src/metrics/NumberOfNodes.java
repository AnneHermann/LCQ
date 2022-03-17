package metrics;

import BspKnotensystem.DocumentRoot;
import report.MetricResponse;
import report.QualityReportResponse;


public class NumberOfNodes implements IMetric {


	private static final String ANZAHL_DER_KNOTEN = "Anzahl der Knoten";

	public void calculate(DocumentRoot documentRoot, QualityReportResponse response) {
		var nodeSystem = documentRoot.getNodeSystem();
	    var numberOfFunctionalNodes = nodeSystem.getNodes().get(0).getNode().size();
	    var numberOfSources = nodeSystem.getSources().get(0).getSource().size();
	    var numberOfResults = nodeSystem.getResults().get(0).getResult().size();
	    var numberOfNodes = numberOfFunctionalNodes + numberOfSources + numberOfResults;
	    
	    response.addMetric(new MetricResponse(ANZAHL_DER_KNOTEN, Integer.toString(numberOfNodes)));
	}

}
