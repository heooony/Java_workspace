class OverloadExam {
	public static void main(String [] args){
		Test t = new Test();
		System.out.println(t.aa(1));
		System.out.println(t.aa(1, 3));
	}
}

class Test{
	public int aa(int a) {
		return a;
	}

	public int aa(int a, int b) {
		return a+b;
	}

}