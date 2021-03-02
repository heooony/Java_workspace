package exercise08_interface;


public class Exercise5 implements Action{
	public static void main(String[] args) {
		Exercise5 action = new Exercise5() {
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		
		action.work();
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}
}