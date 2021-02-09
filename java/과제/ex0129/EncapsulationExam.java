

class EncapsulationExam {
	private int weight = 70;
	private int password = 316;
	
	//비밀번호를 입력받아 현재 비밀번호와 일치하는지 확인하고
	//몸무게를 출력합니다.
	private void getWeight(int password) {
		if(isCorrectPassword(password) == true) {
			System.out.println(weight);
			System.out.println("현재 몸무게는 " + weight + "입니다.");
		} else System.out.println("비밀번호 불일치");
	}
	
	//비밀번호를 입력받아 현재 비밀번호와 일치하는지 확인하고
	//새롭게 입력받은 몸무게를 현재 몸무게에 대입합니다.
	private void setWeight(int password, int newWeight) {
		if(isCorrectPassword(password) == true) {
			weight = newWeight;
			System.out.println("몸무게가 " + weight + "으로 변경되었습니다.");
		} else System.out.println("비밀번호 불일치");
	}

	//이전 비밀번호와 새 비밀번호를 입력받고
	//이전 비밀번호가 일치하다면 새 비밀번호로 변경합니다.
	private void getPassword(int oldPassword, int newPassword) {
		if(isCorrectPassword(oldPassword) == true) {
			this.password = newPassword;
			System.out.println("비밀번호가 " + password + "으로 변경되었습니다.");
		} else System.out.println("비밀번호 불일치");
	}
	
	//현재 비밀번호가 맞는지 확인합니다.
	private boolean isCorrectPassword(int password) {
		if(this.password == password) return true;
		else return false;
	}

	public static void main(String[] args) {

		//EncapsulationExam에 대한 객체를 생성한 이후, args의 타입을 String에서 int로 변환합니다.
		EncapsulationExam encapsulation = new EncapsulationExam();
		int [] argsInt = new int [args.length];
		for(int i = 0; i < args.length; i++)
			argsInt[i] = Integer.parseInt(args[i]);
		
		//인수로 들어온 args의 맨 처음 숫자로 명령을 실행합니다.
		if(argsInt[0] == 1)
			encapsulation.setWeight(argsInt[1], argsInt[2]);
		else if(argsInt[0] == 2)
			encapsulation.getWeight(argsInt[1]);
		else if(argsInt[0] == 3)
			encapsulation.getPassword(argsInt[1], argsInt[2]);
		else
			System.out.println("일치하는 명령이 없습니다.");
	}
}