package exercise09;

public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
//	���� Ŭ���� ��� ���� ����
//	public void method1(final int arg) {
//		final int localVariable = 1;
//		//arg = 100;
//		//localVariable = 100;
//		class Inner {
//			public void method() {
//				int result = arg + localVariable;
//			}
//		}
//	}
//	
//	public void method2(int arg) {
//		int localVariable = 1;
//		//arg = 100;
//		//localVariable = 100;
//		class Inner {
//			public void method() {
//				int result = arg + localVariable;
//			}
//		}
//	}
}
