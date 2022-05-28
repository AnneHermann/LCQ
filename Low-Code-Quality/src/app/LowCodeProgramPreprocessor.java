package app;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;

import AlleKnotenFormartiert.ANodeType;
import AlleKnotenFormartiert.AlleKnotenFormartiertFactory;
import AlleKnotenFormartiert.InputType;
import AlleKnotenFormartiert.NodeSystemType;
import AlleKnotenFormartiert.NodeType;
import AlleKnotenFormartiert.NotFunctionalNodeType;

public class LowCodeProgramPreprocessor {

	public static void FillOutputs(NodeSystemType nodeSystem) {
		for (var result : nodeSystem.getResults().get(0).getResult()) {
			fillOutputsForSources(result.getInput().get(0), nodeSystem, result.getId());
		}

		for (var functionResult : nodeSystem.getFunctionResults().get(0).getFunctionResult()) {
			fillOutputsForSources(functionResult.getInput().get(0), nodeSystem, functionResult.getId());
		}

		for (var node : nodeSystem.getNodes().get(0).getNode()) {
			for (var input : node.getInputs().get(0).getInput()) {
				fillOutputsForSources(input, nodeSystem, node.getId());
			}
		}

	}

	public static void FillAdjacencyLists(NodeSystemType nodeSystem) {
		for (var node : nodeSystem.getNodes().get(0).getNode()) {
			addAllEdgesToAdjacencyList(node);
			resolveEdgesToColumns(node, nodeSystem);
		}

		for (var functionResult : nodeSystem.getFunctionResults().get(0).getFunctionResult()) {
			addAllEdgesToAdjacencyList(functionResult);
			resolveEdgesToColumns(functionResult, nodeSystem);
		}

		for (var result : nodeSystem.getResults().get(0).getResult()) {
			addAllEdgesToAdjacencyList(result);
			resolveEdgesToColumns(result, nodeSystem);
		}

	}

	private static void addAllEdgesToAdjacencyList(NodeType node) {
		for (var input : node.getInputs().get(0).getInput()) {
			for (var source : input.getSource()) {
				addNeighbourNodeIfExists(node, source.getNode());
			}
		}

	}

	private static void addAllEdgesToAdjacencyList(NotFunctionalNodeType node) {
		for (var source : node.getInput().get(0).getSource()) {
			addNeighbourNodeIfExists(node, source.getNode());
		}

	}

	private static void addNeighbourNodeIfExists(ANodeType node, String neighbourNode) {
		if (neighbourNode != null) {
			node.getAdjacencyList().add(neighbourNode);
		}
	}

	private static void resolveEdgesToColumns(ANodeType node, NodeSystemType nodeSystem) {
		var adjacencyList = node.getAdjacencyList();
		var toRemove = new ArrayList<String>();
		var toAdd = new ArrayList<String>();

		for (var neighbour : adjacencyList) {
			for (var source : nodeSystem.getSources().get(0).getSource()) {
				for (var sourceColumn : source.getSourceColumns().get(0).getSourceColumn()) {
					if (neighbour.equals(sourceColumn.getId())) {
						toRemove.add(neighbour);
						toAdd.add(source.getId());
					}
				}
			}

			for (var functionResult : nodeSystem.getFunctionResults().get(0).getFunctionResult()) {
				for (var functionResultColumn : functionResult.getFunctionResult().get(0).getFunctionResultColumn()) {
					if (neighbour.equals(functionResultColumn.getId())) {
						toRemove.add(neighbour);
						toAdd.add(functionResult.getId());
					}
				}
			}
		}

		replaceColumnIdsToNodeIds(toRemove, toAdd, adjacencyList);
		adjacencyList.stream().distinct();

	}

	private static void replaceColumnIdsToNodeIds(ArrayList<String> toRemove, ArrayList<String> toAdd,
			EList<String> adjacencyList) {
		toRemove.stream().forEach(columnIdToRemove -> adjacencyList.remove(columnIdToRemove));
		toAdd.stream().forEach(nodeIdFromColumnToAdd -> adjacencyList.add(nodeIdFromColumnToAdd));
	}

	private static void fillOutputsForSources(InputType input, NodeSystemType nodeSystem, String sourceNodeId) {
		for (var source : input.getSource()) {
			var nodeId = source.getNode();
			if (nodeId != null) {
				findNodeFromId(nodeId, sourceNodeId, nodeSystem);
			}
		}
	}

	private static void findNodeFromId(String id, String sourceId, NodeSystemType nodeSystem) {
		if (isInNodes(id, sourceId, nodeSystem)) {
			return;
		}

		if (isInFunctionResults(id, sourceId, nodeSystem)) {
			return;
		}

		if (isInFunctiionResultColumns(id, sourceId, nodeSystem)) {
			return;
		}

		if (isInSources(id, sourceId, nodeSystem)) {
			return;
		}

		if (isInSourceColumns(id, sourceId, nodeSystem)) {
			return;
		}

		if (isInNodeInputs(id, sourceId, nodeSystem)) {
			return;
		}

		System.out.println("Kante zu " + id + " konnte nicht gefunden werden");

	}

	private static boolean isInNodeInputs(String id, String sourceId, NodeSystemType nodeSystem) {
		for (var node : nodeSystem.getNodes().get(0).getNode()) {
			for (var input : node.getInputs().get(0).getInput()) {
				var sourcesOfInpuWithId = input.getSource().stream().filter(source -> source.getId().equals(id));

				var sourceOfInputWithIdList = sourcesOfInpuWithId.toList();

				if (!sourceOfInputWithIdList.isEmpty()) {
					var output = AlleKnotenFormartiertFactory.eINSTANCE.createOutputType();
					output.setNodeId(sourceId);
					node.getOutputs().add(output);
					return true;
				}
			}
		}

		return false;
	}

	private static boolean isInSourceColumns(String id, String sourceId, NodeSystemType nodeSystem) {
		for (var source : nodeSystem.getSources().get(0).getSource()) {
			var sourceColumnWithId = source.getSourceColumns().get(0).getSourceColumn().stream()
					.filter(sourceColumn -> sourceColumn.getId().equals(id));

			var sourceColumnWithIdList = sourceColumnWithId.toList();

			if (!sourceColumnWithIdList.isEmpty()) {
				var output = AlleKnotenFormartiertFactory.eINSTANCE.createOutputType();
				output.setNodeId(sourceId);
				source.getOutputs().add(output);
				return true;
			}
		}

		return false;
	}

	private static boolean isInSources(String id, String sourceId, NodeSystemType nodeSystem) {
		var sourceWithId = nodeSystem.getSources().get(0).getSource().stream().filter(node -> node.getId().equals(id));

		var sourceWithIdList = sourceWithId.toList();
		if (!sourceWithIdList.isEmpty()) {
			var output = AlleKnotenFormartiertFactory.eINSTANCE.createOutputType();
			output.setNodeId(sourceId);
			sourceWithIdList.get(0).getOutputs().add(output);
			return true;
		}

		return false;
	}

	private static boolean isInFunctiionResultColumns(String id, String sourceId, NodeSystemType nodeSystem) {
		for (var functionResult : nodeSystem.getFunctionResults().get(0).getFunctionResult()) {
			var functionResultColumnWithId = functionResult.getFunctionResult().get(0).getFunctionResultColumn()
					.stream().filter(functionResultColumn -> functionResultColumn.getId().equals(id));

			var functionResultColumnWithIdList = functionResultColumnWithId.toList();

			if (!functionResultColumnWithIdList.isEmpty()) {
				var output = AlleKnotenFormartiertFactory.eINSTANCE.createOutputType();
				output.setNodeId(sourceId);
				functionResult.getOutputs().add(output);
				return true;
			}
		}

		return false;
	}

	private static boolean isInFunctionResults(String id, String sourceId, NodeSystemType nodeSystem) {
		var functionResultWithId = nodeSystem.getFunctionResults().get(0).getFunctionResult().stream()
				.filter(node -> node.getId().equals(id));

		var functionResultWithIdList = functionResultWithId.toList();
		if (!functionResultWithIdList.isEmpty()) {
			var output = AlleKnotenFormartiertFactory.eINSTANCE.createOutputType();
			output.setNodeId(sourceId);
			functionResultWithIdList.get(0).getOutputs().add(output);
			return true;
		}

		return false;
	}

	private static boolean isInNodes(String id, String sourceId, NodeSystemType nodeSystem) {
		var nodeWithId = nodeSystem.getNodes().get(0).getNode().stream().filter(node -> node.getId().equals(id));

		var nodeWithIdList = nodeWithId.toList();
		if (!nodeWithIdList.isEmpty()) {
			var output = AlleKnotenFormartiertFactory.eINSTANCE.createOutputType();
			output.setNodeId(sourceId);
			nodeWithIdList.get(0).getOutputs().add(output);
			return true;
		}

		return false;
	}

}
