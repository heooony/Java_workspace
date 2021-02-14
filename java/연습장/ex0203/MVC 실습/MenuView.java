
/**
	사용자의 키보드 입력 받는 클래스
*/

import java.util.Scanner;

public class MenuView {
	Scanner sc = new Scanner(System.in);
	ElectronicsController controller;

	public MenuView() {
		controller = new ElectronicsController();
	}
	
	public void printMenu() {
		while(true) {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("1. 등록, 2. 검색, 3. 목록, 4. 수정, 5. 삭제, 6. 구매 가능 제품 9. 종료");
			System.out.println("----------------------------------------------------------------------");
			System.out.print("선택> ");
			int selectNum = sc.nextInt();

			switch(selectNum) {
				case 1: inputInsert(); break;
				case 2: inputSearch(); break;
				case 3: controller.selectAll(); break;
				case 4: inputUpdate(); break;
				case 5: inputDelete(); break;
				case 6: inputPurchase(); break;
				case 9: System.exit(0);
				default: System.out.println("잘못된 접근입니다.");
			}
		}
	}

	/**
		등록에 필요한 키보드 입력
	*/
	public void inputInsert() {
		if(ElectronicsService.count < 100) {
			System.out.print("모델 번호 : ");
			int modelNo = sc.nextInt();

			sc.nextLine();
			System.out.print("이름 : ");
			String modelName = sc.nextLine();

			System.out.print("가격 : ");
			int modelPrice = sc.nextInt();

			sc.nextLine();
			System.out.print("설명 : ");
			String modelDetail = sc.nextLine();

			Electronics electronics = new Electronics(modelNo, modelName, modelPrice, modelDetail);
			controller.insert(electronics);
		}
		
	}

	/**
		검색에 필요한 키보드 입력
	*/
	public void inputSearch() {
		System.out.print("모델 번호 : ");
		int modelNo = sc.nextInt();

		controller.searchByModelNo(modelNo);
	}

	/**
		수정에 필요한 키보드 입력
	*/
	public void inputUpdate() {
		System.out.print("변경하고 싶은 제품의 모델 번호 : ");
		int modelNo = sc.nextInt();

		sc.nextLine();
		System.out.print("변경할 설명 : ");
		String modelDetail = sc.nextLine();

		Electronics electronics = new Electronics(modelNo, modelDetail);
		controller.update(electronics);
	}

	public void inputDelete() {
		System.out.print("삭제하고 싶은 제품의 모델 번호 : ");
		int modelNo = sc.nextInt();
		
		controller.delete(modelNo);
	}

	public void inputPurchase() {
		System.out.print("현재 예산 : ");
		int money = sc.nextInt();

		controller.purchase(money);
	}
}