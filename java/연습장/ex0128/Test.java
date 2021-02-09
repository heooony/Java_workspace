class Test {
	public static void main(String [] args) {
		A a = new A();
		a.aMethod1();
		a.aMethod2();
		a.aMethod3();
		a.aMethod4();
	}
}

class A {
	public void aMethod1() {}
	protected int aMethod2() {}
	int aMethod3() {}
	private int aMethod4() {}
}

class B {
	public void bMethod1() {}
	protected int bMethod2() {}
	int bMethod3() {}
	private int bMethod4() {}
}