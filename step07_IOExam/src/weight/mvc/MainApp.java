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
					default : System.out.println("1~5사이의 값을 입력하세요.");
				}
			} catch (Exception e) {
				System.out.println("입력 값이 잘못되었습니다.");
			}
		}
	}
	
	public static void inputWeight() {
		System.out.println("이름을 입력하여 주십시요");
		System.out.print("이름 : ");
		String name = scanner.next();
		
		System.out.println("몸무게를 입력하여 주십시요");
		System.out.print("몸무게 : ");
		int weight = scanner.nextInt();
		
		System.out.println("비밀번호를 입력하여 주십시요");
		System.out.print("비밀번호 : ");
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
		System.out.println("다음 사항에 맞게 입력하여 주십시요");
		System.out.println("======> 몸무게 입력은 1번");
		System.out.println("======> 몸무게 검색은 2번");
		System.out.println("======> 몸무게 변경은 3번");
		System.out.println("======> 비밀번호 변경은 4번");
		System.out.println("======> 프로그램 종료는 5번");
		System.out.println("을 입력후 Enter 을 눌러 주십시요");
		System.out.print("메뉴 선택 : ");
	}
	
	public static Person checkInfo() {
		System.out.println("이름을 입력하여 주십시요");
		System.out.print("이름 : ");
		String name = scanner.next();
		
		System.out.println("비밀번호를 입력하여 주십시요");
		System.out.print("비밀번호 : ");
		int password = scanner.nextInt();
		
		Person person = new Person(name, password);
		return person;
	}
}
