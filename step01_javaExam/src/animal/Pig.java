package animal;

public class Pig extends Animal {
	
	Pig() {}
	Pig(String name, String bodyColor) {
		super(name,bodyColor);
	}
	
	@Override
	public void sound() {
		System.out.println("Pig�� �ܲ�");

	}

	@Override
	public void eat() {
		System.out.println("Pig�� �����̵� �� �Ծ��.");
	}
}
