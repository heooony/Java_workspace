package virus;

public class Level3 extends Level2{

	public Level3() {
		information = "3�ܰ� : ������ ������";
	}
	
	@Override
	public void checkLevel(int num) {
		if(1000 <= num) {
			System.out.println("3�ܰ� �Դϴ�.");
		} else {
			System.out.println("3�ܰ� �� �Ʒ��Դϴ�.");
		}
	}
}
