package ex0210;

public class MethodArgsExam {
	public void aa(int ... i) {
		System.out.println("인수의 개수 = "  + i.length);
	}
	
	public static void main(String[] args) {
		MethodArgsExam me = new MethodArgsExam();
		me.aa(3);
		me.aa();
		me.aa(10, 2, 3);
		me.aa(3, 4, 5, 6, 7, 8, 9);
	}
}
