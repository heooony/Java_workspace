package exercise09;

public class A2 {
	B2 field1 = new B2();
	C2 field2 = new C2();
	
	void method1() {
		B2 var1 = new B2();
		C2 var2 = new C2();
	}
	
	//static B2 field3 = new B2();
	static C2 field4 = new C2();
	
	static void method2() {
		//B2 var1 = new B2();
		C2 var2 = new C2();
	}
	
	class B2 {}
	static class C2{}
}
