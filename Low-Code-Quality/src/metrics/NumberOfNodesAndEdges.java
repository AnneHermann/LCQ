package metrics;

import AlleKnotenFormartiert.DocumentRoot;
import AlleKnotenFormartiert.InputType;
import AlleKnotenFormartiert.NodeSystemType;
import report.MetricResponse;
import report.QualityReportResponse;

public class NumberOfNodesAndEdges implements IMetric {

	private static final String ANZAHL_DER_KNOTEN_UND_KANTEN = "Anzahl der Knoten und Kanten";

	public void Calculate(DocumentRoot documentRoot, QualityReportResponse response) {
		var nodeSystem = documentRoot.getNodeSystem();
		var numberOfNodesAndEdges = getNumberOfNodes(nodeSystem) + getNumberOfEdges(nodeSystem);

		response.AddMetricResponse(
				new MetricResponse(ANZAHL_DER_KNOTEN_UND_KANTEN, Integer.toString(numberOfNodesAndEdges)));
	}

	public static int getNumberOfNodes(NodeSystemType nodeSystem) {
		var numberOfFunctionalNodes = nodeSystem.getNodes().get(0).getNode().size();
		var numberOfSources = nodeSystem.getSources().get(0).getSource().size();
		var numberOfFunctionResult = nodeSystem.getFunctionResults().get(0).getFunctionResult().size();
		var numberOfResults = nodeSystem.getResults().get(0).getResult().size();
		return numberOfFunctionalNodes + numberOfSources + numberOfResults + numberOfFunctionResult;

	}

	public static int getNumberOfEdges(NodeSystemType nodeSystem) {

		return countEdgesOfAllNodes(nodeSystem) + countEdgesOfAllFunctionResults(nodeSystem) + countEdgesOfAllResults(nodeSystem);


	}
	
	private static int countEdgesOfAllResults(NodeSystemType nodeSystem) {
		var counter = 0;
		
		for (var result : nodeSystem.getResults().get(0).getResult()) {
			counter = countEdgesOfAllSources(counter, result.getInput().get(0));
		}
		
		return counter;
	}
	
	private static int countEdgesOfAllFunctionResults(NodeSystemType nodeSystem) {
		var counter = 0;
		
		for (var functionResult : nodeSystem.getFunctionResults().get(0).getFunctionResult()) {
			counter = countEdgesOfAllSources(counter, functionResult.getInput().get(0));
		}
		
		return counter;
	}

	private static int countEdgesOfAllNodes(NodeSystemType nodeSystem) {
		var counter = 0;
		for (var node : nodeSystem.getNodes().get(0).getNode()) {
			for (var input : node.getInputs().get(0).getInput()) {
				counter = countEdgesOfAllSources(counter, input);
			}
		}
		return counter;
	}

	private static int countEdgesOfAllSources(int counter, InputType input) {
		for (var source : input.getSource()) {
			if (source.getNode() != null) {
				counter++;
			}
		}
		return counter;
	}
	
	
}
