package ex0209;

public class ShoppingMallExample {
	public static void main(String[] args)  {
		ShoppingMall sm = new ShoppingMall();
		int count = 0;
		for(int i = 0; i < 10; i++) {
			int randNum = (int)(Math.random() * 55) + 1;
			try {
				sm.ageCheck(randNum);
			} catch (AgeCheckException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("입장 거절 인원 수 : " + AgeCheckException.count);
	}
}
