package ex0209;

class Test {
	public void aa(int i ) throws ArithmeticException {
		System.out.println("aa()호출");
		try {
			this.bb(i);
		} finally {
			System.out.println("aa()종료");
		}
	}
	
	public void bb(int i)   {
		System.out.println("bb()호출");
		try {
			int result = 100 / i;
			System.out.println("나눈 결과 : " + result);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("bb()종료");
		}
	}
}
public class ThrowsExceptionExam {
	public static void main(String[] args) {
		System.out.println("---메인 시작---");
		Test t = new Test();
		try {
			t.aa(0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("---메인 끝---");
	}
}
