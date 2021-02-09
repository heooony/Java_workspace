import java.util.Scanner;

class StaticExam {
	public static void main(String [] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3.PI);

	}
}

class Test {
	int a = 10;
	final static double PI = 3.141592653589792;
	
	//non-static메소드 안에서는 non-static모두 접근가능, this키워드 가능
	public void aa() {
		System.out.println(a);
		System.out.println(this.a);


	}
	
	public void bb() {
		aa();
		this.aa();

		dd();
		this.dd();
	}

	public static void cc() {
		//System.out.println(a);
		//System.out.println(this.a);


		//System.out.println(this.b);

	}

	public static void dd() {
		
	}
}