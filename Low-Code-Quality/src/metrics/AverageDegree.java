package metrics;

import AlleKnotenFormartiert.DocumentRoot;
import AlleKnotenFormartiert.InputType;
import report.QualityReportResponse;
import report.MetricResponse;

public class AverageDegree implements IMetric {

	private static final String DURCHSCHNITTLICHER_GRAD = "Durchschnittlicher Grad";

	@Override
	public void Calculate(DocumentRoot documentRoot, QualityReportResponse response) {
		var nodeSystem = documentRoot.getNodeSystem();
		var degrees = 0;

		for (var node : nodeSystem.getNodes().get(0).getNode()) {
			for (var input : node.getInputs().get(0).getInput()) {
				degrees += countIngoingEdges(input);
				
			}
			degrees += node.getOutputs().size();
		}
		
		var numberOfNodesAndEdges = new NumberOfNodesAndEdges();
		
		var averageDegree = (double) degrees / numberOfNodesAndEdges.getNumberOfNodes(nodeSystem);

		response.AddMetricResponse(new MetricResponse(DURCHSCHNITTLICHER_GRAD, Double.toString(averageDegree)));

	}

	private int countIngoingEdges(InputType input) {
		var counter = 0;
		for (var source : input.getSource()) {
			if (source.getNode() != null) {
				counter++;
			}
		}
		return counter;
	}

}
