package virus;

public class Level2 extends Level1 {
	Object object;
	public Level2() {
		information = "2단계 : 지역 유행, 급속 전파, 전국적 확산 개시";
	}
	
	//	잘못된 예시 1 : 멋대로 Override하는 경우
	@Override
	public void introduce() {
		System.out.println("2단계 : 지역 유행, 급속 전파, 전국적 확산 개시");
	}
	
	// 잘못된 예시 2 : 부모 클래스의 기능을 퇴화시키는 경우
	@Override
	public void checkLevel(int num) {
		if(300 <= num) {
			System.out.println("2단계 입니다.");
		} else {
			System.out.println("2단계 그 아래입니다.");
		}
	}
}
