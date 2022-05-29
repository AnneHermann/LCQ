package metrics;

import AlleKnotenFormartiert.NodeSystemType;
import report.MetricResponse;
import report.QualityReportResponse;

public class LinesOfComments implements IMetric {

	private static final String ANTEIL_DER_KOMMENTIERTEN_KNOTEN = "Anteil der kommentierten Knoten";

	@Override
	public void Calculate(NodeSystemType nodeSystem, QualityReportResponse response) {
		var numberOfNodes = NumberOfNodesAndEdges.getNumberOfNodes(nodeSystem);
		var numberOfCommentedNodes = getNumberOfAllCommentedNodes(nodeSystem);
		var precentageOfCommentedNodes = ((double) numberOfCommentedNodes) / numberOfNodes;

		response.AddMetricResponse(
				new MetricResponse(ANTEIL_DER_KOMMENTIERTEN_KNOTEN, Double.toString(precentageOfCommentedNodes)));

	}

	private int getNumberOfAllCommentedNodes(NodeSystemType nodeSystem) {
		return getNumberOfCommentedNodes(nodeSystem) + getNumberOfCommentedFunctionResults(nodeSystem)
				+ getNumberOfCommentedSources(nodeSystem) + getNumberOfCommentedResults(nodeSystem);
	}

	private int getNumberOfCommentedNodes(NodeSystemType nodeSystem) {
		int counter = 0;
		for (var node : nodeSystem.getNodes().get(0).getNode()) {
			if (node.getDescription() != null) {
				counter++;
			}
		}

		return counter;

	}

	private int getNumberOfCommentedFunctionResults(NodeSystemType nodeSystem) {
		int counter = 0;
		for (var functionResult : nodeSystem.getFunctionResults().get(0).getFunctionResult()) {
			if (functionResult.getDescription() != null) {
				counter++;
			}
		}

		return counter;
	}

	private int getNumberOfCommentedSources(NodeSystemType nodeSystem) {
		int counter = 0;
		for (var source : nodeSystem.getSources().get(0).getSource()) {
			if (source.getDescription() != null) {
				counter++;
			}
		}

		return counter;
	}

	private int getNumberOfCommentedResults(NodeSystemType nodeSystem) {
		int counter = 0;
		for (var source : nodeSystem.getResults().get(0).getResult()) {
			if (source.getDescription() != null) {
				counter++;
			}
		}

		return counter;
	}

}
