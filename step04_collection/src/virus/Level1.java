package virus;

public class Level1 implements COVID19 {

	String information;
	
	public Level1() {
		information = "1�ܰ� : ��Ȱ�� �Ÿ��α�";
	}
	
	@Override
	public void introduce() {
		System.out.println(information);
	}
	
	@Override
	public void checkLevel(int num) {
		if(100 <= num) {
			System.out.println("1�ܰ� �Դϴ�.");
		} else {
			System.out.println("�����մϴ�.");
		}
	}
}
