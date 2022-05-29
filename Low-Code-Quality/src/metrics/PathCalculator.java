package metrics;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import AlleKnotenFormartiert.ANodeType;
import AlleKnotenFormartiert.NodeSystemType;

public class PathCalculator {

	private NodeSystemType nodeSystem;
	private ArrayList<Integer> pathLengths;

	public PathCalculator(NodeSystemType nodeSystem) {
		this.nodeSystem = nodeSystem;
		pathLengths = new ArrayList<Integer>();
		findAllPaths();
	}

	public int getLengthOfLongestPath() {
		return pathLengths.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new);
	}

	public double getAveragePathLength() {
		return pathLengths.stream().mapToInt(v -> v).average().orElseThrow(NullPointerException::new);
	}

	private void findAllPaths() {
		for (var result : nodeSystem.getResults().get(0).getResult()) {
			for (var source : nodeSystem.getSources().get(0).getSource()) {
				findAllPathsFromResultToSource(result, source);
			}
		}
	}

	private void findAllPathsFromResultToSource(ANodeType result, ANodeType source) {
		var isVisited = new ArrayList<String>();
		var pathList = new ArrayList<String>();

		pathList.add(result.getId());

		findAllPathsUtil(result, source, isVisited, pathList);
	}

	private void findAllPathsUtil(ANodeType node, ANodeType source, ArrayList<String> isVisited,
			ArrayList<String> localPathList) {
		var nodeId = node.getId();
		if (nodeId.equals(source.getId())) {
			pathLengths.add(localPathList.size());
			return;
		}

		if (isSource(node)) {
			localPathList.remove(node.getId());
			return;
		}

		isVisited.add(nodeId);

		for (var neighbour : node.getAdjacencyList()) {
			if (!isVisited.contains(neighbour)) {
				localPathList.add(neighbour);
				// System.out.println(neighbour);
				findAllPathsUtil(getNode(neighbour), source, isVisited, localPathList);
				localPathList.remove(neighbour);
			}
		}

		isVisited.remove(nodeId);
	}

	private boolean isSource(ANodeType node) {
		for (var source : nodeSystem.getSources().get(0).getSource()) {
			if (source.getId().equals(node.getId())) {
				return true;
			}
		}
		return false;
	}

	private ANodeType getNode(String id) {
		for (var node : nodeSystem.getNodes().get(0).getNode()) {
			if (node.getId().equals(id)) {
				return node;
			}
		}

		for (var functionResult : nodeSystem.getFunctionResults().get(0).getFunctionResult()) {
			if (functionResult.getId().equals(id)) {
				return functionResult;
			}
		}

		for (var result : nodeSystem.getResults().get(0).getResult()) {
			if (result.getId().equals(id)) {
				return result;
			}
		}

		for (var source : nodeSystem.getSources().get(0).getSource()) {
			if (source.getId().equals(id)) {
				return source;
			}
		}

		return null; // TODO
	}

}
