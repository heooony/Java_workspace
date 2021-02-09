class Test {
	private static Test instance = new Test();
	int num;
	private Test(){
		num = 3;
	}

	public static Test getInstance() {
		return instance;
	}

	public void print() {
		System.out.println(num);
	}
}

class PrivateConstructorExam{
	public static void main(String[] args) {
		Test t = Test.getInstance();
		t.print();
	}
}