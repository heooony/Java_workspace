package mvc;

import java.util.List;

/**
	����� ��û�� ���� ����� ȭ�鿡 ����ϴ� Ŭ����
*/
public class EndView {

	/**
		��ü ���
	*/
	public static void printAll(List<Electronics> electronics) {
		for(int i = 0; i < electronics.size(); i++) {
			System.out.println(electronics.get(i).getModelNo() + "\t" + 
					electronics.get(i).getModelName() + "\t" + 
					electronics.get(i).getModelPrice() + "\t" + 
					electronics.get(i).getModelDetail());
		}
		System.out.println();
	}
	

	public static void printPurchaseList(Electronics[] electronics) {
		for(int i = 0; i < electronics.length; i++) {
			System.out.println(electronics[i].getModelNo() + "\t" + electronics[i].getModelName() + "\t" + electronics[i].getModelPrice() + "\t" + electronics[i].getModelDetail());
		}
		System.out.println();
	}

	/**
		�� ��ȣ�� �ش��ϴ� ������ǰ ���
	*/
	public static void printSearchByNodelNo(Electronics electronics) {
		System.out.println(electronics.getModelNo() + "\t" + electronics.getModelName() + "\t" + electronics.getModelPrice() + "\t" + electronics.getModelDetail());
		System.out.println();
	}
	
	/**
		���� �Ǵ� ���п� ���� �޽��� ���
	*/
	public static void printMessage(String str) {
		System.out.println(str);
		System.out.println();
	}
}