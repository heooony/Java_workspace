package virus;

public class Level3 extends Level2{

	public Level3() {
		information = "3단계 : 전국적 대유행";
	}
	
	@Override
	public void checkLevel(int num) {
		if(1000 <= num) {
			System.out.println("3단계 입니다.");
		} else {
			System.out.println("3단계 그 아래입니다.");
		}
	}
}
