package report;

public class MetricResponse {
	
	private String name;
	private String result;

	public MetricResponse(String name, String result) {
		this.setName(name);
		this.setResult(result);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
