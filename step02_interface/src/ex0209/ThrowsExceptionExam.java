package ex0209;

class Test {
	public void aa(int i ) throws ArithmeticException {
		System.out.println("aa()ȣ��");
		try {
			this.bb(i);
		} finally {
			System.out.println("aa()����");
		}
	}
	
	public void bb(int i)   {
		System.out.println("bb()ȣ��");
		try {
			int result = 100 / i;
			System.out.println("���� ��� : " + result);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("bb()����");
		}
	}
}
public class ThrowsExceptionExam {
	public static void main(String[] args) {
		System.out.println("---���� ����---");
		Test t = new Test();
		try {
			t.aa(0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("---���� ��---");
	}
}
