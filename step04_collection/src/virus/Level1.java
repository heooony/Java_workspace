package virus;

public class Level1 implements COVID19 {

	String information;
	
	public Level1() {
		information = "1단계 : 생활속 거리두기";
	}
	
	@Override
	public void introduce() {
		System.out.println(information);
	}
	
	@Override
	public void checkLevel(int num) {
		if(100 <= num) {
			System.out.println("1단계 입니다.");
		} else {
			System.out.println("안전합니다.");
		}
	}
}
