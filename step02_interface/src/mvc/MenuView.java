package mvc;

/**
	������� Ű���� �Է� �޴� Ŭ����
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
			System.out.println("1. ���, 2. �˻�, 3. ���, 4. ����, 5. ����, 6. ���� ���� ��ǰ 9. ����");
			System.out.println("----------------------------------------------------------------------");
			System.out.print("����> ");
			int selectNum = sc.nextInt();

			switch(selectNum) {
				case 1: inputInsert(); break;
				case 2: inputSearch(); break;
				case 3: controller.selectAll(); break;
				case 4: inputUpdate(); break;
				case 5: inputDelete(); break;
				case 6: inputPurchase(); break;
				case 9: System.exit(0);
				default: System.out.println("�߸��� �����Դϴ�.");
			}
		}
	}

	/**
		��Ͽ� �ʿ��� Ű���� �Է�
	*/
	public void inputInsert() {
			System.out.print("�� ��ȣ : ");
			int modelNo = sc.nextInt();

			sc.nextLine();
			System.out.print("�̸� : ");
			String modelName = sc.nextLine();

			System.out.print("���� : ");
			int modelPrice = sc.nextInt();

			sc.nextLine();
			System.out.print("���� : ");
			String modelDetail = sc.nextLine();

			Electronics electronics = new Electronics(modelNo, modelName, modelPrice, modelDetail);
			controller.insert(electronics);
		
	}

	/**
		�˻��� �ʿ��� Ű���� �Է�
	*/
	public void inputSearch() {
		System.out.print("�� ��ȣ : ");
		int modelNo = sc.nextInt();

		controller.searchByModelNo(modelNo);
	}

	/**
		������ �ʿ��� Ű���� �Է�
	*/
	public void inputUpdate() {
		System.out.print("�����ϰ� ���� ��ǰ�� �� ��ȣ : ");
		int modelNo = sc.nextInt();

		sc.nextLine();
		System.out.print("������ ���� : ");
		String modelDetail = sc.nextLine();

		Electronics electronics = new Electronics(modelNo, modelDetail);
		controller.update(electronics);
	}

	public void inputDelete() {
		System.out.print("�����ϰ� ���� ��ǰ�� �� ��ȣ : ");
		int modelNo = sc.nextInt();
		
		controller.delete(modelNo);
	}

	public void inputPurchase() {
		System.out.print("���� ���� : ");
		int money = sc.nextInt();

		controller.purchase(money);
	}
}