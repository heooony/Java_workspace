package weight.mvc;

public class Person {
	private String name;
	private int weight;
	private int password;
	
	public Person() {}
	public Person(String name, int password) {
		this.name = name;
		this.password = password;
	}
	public Person(String name, int weight, int password) {
		this(name, password);
		this.weight = weight;
	}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getWeight() { return weight; }
	public void setWeight(int weight) { this.weight = weight; }
	public int getPassword() { return password; }
	public void setPassword(int password) { this.password = password; }
}
