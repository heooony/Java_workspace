package weight.mvc;

public class SuccessView {
	public SuccessView() {}
	
	public static void printWeight(Person person) {
		System.out.println("===========================");
		System.out.println("\t" + person.getName() + "���� �����Դ� " + person.getWeight() + "kg �Դϴ�." + "\t");
		System.out.println("===========================");
	}
	
	public static void printPassword(Person person) {
		System.out.println("===========================");
		System.out.println("\t" + person.getName() + "���� ��й�ȣ�� " + person.getPassword() + "�Դϴ�." + "\t");
		System.out.println("\t������ ��й�ȣ�� �Է��Ͽ� �ֽʽÿ�.");
		System.out.println("===========================");
	}
	
	public static void printMessage(String message) {
		System.out.println(message);
	}
}
