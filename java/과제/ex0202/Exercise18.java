class ShopService {
	//다른 객체를 생성하려면 다음 3번째 줄을 주석처리
	private static ShopService instance = new ShopService();
	private ShopService() {}

	public static ShopService getInstance() {
		//다른 객체를 생성하려면 다음 주석을 해제
		//ShopService instance = new ShopService();
		return instance;
	}
}

class Exercise18 {
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();

		if(obj1 == obj2)
			System.out.println("같은 ShopService 객체 입니다.");
		else
			System.out.println("다른 ShopService 객체 입니다.");
	}
}