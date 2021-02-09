package animal;

public abstract class Animal {
	private String name;
	private String bodyColor;
	public Animal() {}
	public Animal(String name, String bodyColor) {
		super();
		this.name = name;
		this.bodyColor = bodyColor;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBodyColor() {
		return bodyColor;
	}
	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}
	public abstract void sound();
	public abstract void eat();
	public void run() {}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Animal [name=");
		sb.append(name);
		sb.append(", bodyColor=");
		sb.append(bodyColor);
		sb.append("]");
		return sb.toString();
	}
	
}