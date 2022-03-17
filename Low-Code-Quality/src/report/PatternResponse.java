package report;

public class PatternResponse {
	
	private String name;
	private boolean isFound;
	private int numberOfOccurrences;
	
	public PatternResponse (String name, boolean isFound, int numberOfOccurrences) {
		this.name = name;
		this.isFound = isFound;
		this.numberOfOccurrences = numberOfOccurrences;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFound() {
		return isFound;
	}
	public void setFound(boolean isFound) {
		this.isFound = isFound;
	}
	public int getNumberOfOccurrences() {
		return numberOfOccurrences;
	}
	public void setNumberOfOccurrences(int numberOfOccurrences) {
		this.numberOfOccurrences = numberOfOccurrences;
	}

}
