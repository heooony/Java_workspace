import java.util.Scanner;

class StudentMenuView {
	
	static StudentService service;
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		String [][] data = {
			{"10", "김동헌", "24", "성남시"},
			{"11", "김가람", "28", "경기도"},
			{"12", "김향순", "54", "양양군"},
			{"13", "김은수", "59", "여주시"},
			{"14", "홍당무", "14", "고구려"},
		};
		service = new StudentService(data);
		menuPrint();
	}

	//메뉴 항목
	public static void menuPrint() {
		
		while(true) {
			System.out.println("──────────");
			System.out.println("1. 등록");
			System.out.println("2. 전체검색");
			System.out.println("3. 학번검색");
			System.out.println("4. 정보수정");
			System.out.println("9. 종료");
			System.out.println("──────────");
			System.out.print("키 입력 : ");
			
			int menuChoice = scanner.nextInt();
			switch(menuChoice) {
				case 1:
					insertMenu();
					break;
				case 2:
					EndView.printSelectAll(service.selectAll());
					break;
				case 3:
					searchBySnoMenu();
					break;
				case 4:
					updateMenu();
					break;
				case 9:
					System.exit(0);
				default:
					System.out.println("잘못된 접근입니다.");
			}
		}
	}

	public static void insertMenu() {
		System.out.print("학번은? ");
		int sno = scanner.nextInt();

		scanner.nextLine();
		System.out.print("이름은? ");
		String name = scanner.nextLine();

		System.out.print("나이는? ");
		int age = scanner.nextInt();

		scanner.nextLine();
		System.out.print("주소는? ");
		String addr = scanner.nextLine();
		
		Student student = new Student(sno, name, age, addr);
		if(service.insert(student)) {
			EndView.printMessage("등록되었습니다.");
		} else {
			EndView.printMessage("등록되지 않았습니다.");
		}
	}

	public static void searchBySnoMenu() {
		System.out.print("학번은? ");
		int sno = scanner.nextInt();

		Student student = new Student();
		student = service.searchBySno(sno);
		EndView.printSearch(student);
	}

	public static void updateMenu() {
		System.out.print("학번은? ");
		int sno = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("이름은? ");
		String name = scanner.nextLine();

		System.out.print("나이는? ");
		int age = scanner.nextInt();

		Student student = new Student(sno, name, age);
	
		if(service.update(student))
			EndView.printMessage("변경되었습니다.");
		else
			EndView.printMessage("일치하는 학번이 없습니다.");
	}
}