package animal;

public class Cat extends Animal {
	private int legs;
	public Cat() {
		
	}
	public Cat(String name, String bodyColor, int legs) {
		super(name, bodyColor);
		this.legs = legs;
	}
	

	@Override
	public void sound() {
		System.out.println("Cat�� sound ��~��~");
	}

	@Override
	public void eat() {
		System.out.println("Cat�� �Դ´�.");
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + legs);
		return sb.toString();
	}

}
