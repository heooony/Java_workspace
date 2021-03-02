package weight.mvc;

import java.util.Scanner;

public class MainApp {
	static Scanner scanner = new Scanner(System.in);
	static WeightController controller = new WeightController();
	
	public static void main(String[] args) {
		while(true) {
			try {
				printMenu();
				int selectNum = Integer.parseInt(scanner.next());
				
				switch(selectNum) {
					case 1: inputWeight(); break;
					case 2: searchWeight(); break;
					case 3: modifyWeight(); break;
					case 4: modifyPassword(); break;
					case 5: System.exit(0);
					default : System.out.println("1~5������ ���� �Է��ϼ���.");
				}
			} catch (Exception e) {
				System.out.println("�Է� ���� �߸��Ǿ����ϴ�.");
			}
		}
	}
	
	public static void inputWeight() {
		System.out.println("�̸��� �Է��Ͽ� �ֽʽÿ�");
		System.out.print("�̸� : ");
		String name = scanner.next();
		
		System.out.println("�����Ը� �Է��Ͽ� �ֽʽÿ�");
		System.out.print("������ : ");
		int weight = scanner.nextInt();
		
		System.out.println("��й�ȣ�� �Է��Ͽ� �ֽʽÿ�");
		System.out.print("��й�ȣ : ");
		int password = scanner.nextInt();
		
		Person person = new Person(name, weight, password);
		controller.insertWeight(person);
	}
	
	public static void searchWeight() {
		Person person = checkInfo();
		controller.searchWeight(person);
	}
	
	public static void modifyWeight() {
		Person person = checkInfo();
		controller.modifyWeight(person);
	}
	
	public static void modifyPassword() {
		Person person = checkInfo();
		controller.modifyPassword(person);
	}
	
	public static void printMenu() {
		System.out.println("���� ���׿� �°� �Է��Ͽ� �ֽʽÿ�");
		System.out.println("======> ������ �Է��� 1��");
		System.out.println("======> ������ �˻��� 2��");
		System.out.println("======> ������ ������ 3��");
		System.out.println("======> ��й�ȣ ������ 4��");
		System.out.println("======> ���α׷� ����� 5��");
		System.out.println("�� �Է��� Enter �� ���� �ֽʽÿ�");
		System.out.print("�޴� ���� : ");
	}
	
	public static Person checkInfo() {
		System.out.println("�̸��� �Է��Ͽ� �ֽʽÿ�");
		System.out.print("�̸� : ");
		String name = scanner.next();
		
		System.out.println("��й�ȣ�� �Է��Ͽ� �ֽʽÿ�");
		System.out.print("��й�ȣ : ");
		int password = scanner.nextInt();
		
		Person person = new Person(name, password);
		return person;
	}
}
