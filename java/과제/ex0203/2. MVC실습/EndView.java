

/**
	사용자 요청에 대한 결과를 화면에 출력하는 클래스
*/
public class EndView {

	/**
		전체 출력
	*/
	public static void printAll(Electronics[] electronics) {
		for(int i = 0; i < ElectronicsService.count; i++) {
			System.out.println(electronics[i].getModelNo() + "\t" + electronics[i].getModelName() + "\t" + electronics[i].getModelPrice() + "\t" + electronics[i].getModelDetail());
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
		모델 번호에 해당하는 전자제품 출력
	*/
	public static void printSearchByNodelNo(Electronics electronics) {
		System.out.println(electronics.getModelNo() + "\t" + electronics.getModelName() + "\t" + electronics.getModelPrice() + "\t" + electronics.getModelDetail());
		System.out.println();
	}
	
	/**
		성공 또는 실패에 따른 메시지 출력
	*/
	public static void printMessage(String str) {
		System.out.println(str);
		System.out.println();
	}
}