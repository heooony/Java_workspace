package weight.mvc;

public class SuccessView {
	public SuccessView() {}
	
	public static void printWeight(Person person) {
		System.out.println("===========================");
		System.out.println("\t" + person.getName() + "님의 몸무게는 " + person.getWeight() + "kg 입니다." + "\t");
		System.out.println("===========================");
	}
	
	public static void printPassword(Person person) {
		System.out.println("===========================");
		System.out.println("\t" + person.getName() + "님의 비밀번호는 " + person.getPassword() + "입니다." + "\t");
		System.out.println("\t변경할 비밀번호를 입력하여 주십시요.");
		System.out.println("===========================");
	}
	
	public static void printMessage(String message) {
		System.out.println(message);
	}
}
