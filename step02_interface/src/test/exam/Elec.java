package test.exam;

public class Elec {
	private String code;
	private int cost;
	
	Elec() {
		this(null, 0);
	}
	Elec(String code, int cost) {
		this.code = code;
		this.cost = cost;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public String toString() {
		return null;
	}
}
