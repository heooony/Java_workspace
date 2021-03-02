package animal;

public class Pig extends Animal {
	
	Pig() {}
	Pig(String name, String bodyColor) {
		super(name,bodyColor);
	}
	
	@Override
	public void sound() {
		System.out.println("PigÀÇ ²Ü²Ü");

	}

	@Override
	public void eat() {
		System.out.println("Pig´Â ¹«¾ùÀÌµç ´Ù ¸Ô¾î¿ä.");
	}
}
