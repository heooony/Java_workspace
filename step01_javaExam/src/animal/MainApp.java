package animal;

public class MainApp {
	public static void main(String[] args) {
		Animal animal = null;
		
		animal = new Cat("고", "갈", 4);
		MainApp.test(animal);
		
		animal = new Dog();
		MainApp.test(animal);
		
		animal = new Pig();
		MainApp.test(animal);
	}
	
	public static void test(Animal animal) {
		System.out.println(animal.getClass().getSimpleName() + " 입니다.");
		animal.sound();
		animal.eat();
		animal.run();
	}
}
