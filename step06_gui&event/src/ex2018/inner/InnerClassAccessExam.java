package ex2018.inner;

class Test {
	int a = 50;
	static int b = 10;
	public void testMethod1() {}
	public static void testMethod2() {}
	
	public void outerMethod() {
		class LocalInner {
			int a = 10;
			public void aa() {
				System.out.println(a);
				System.out.println(b);
			}
		}
		
		LocalInner local = new LocalInner();
		local.aa();
	}
	
//	class InstanceInner {
//		int a = 100;
//		// static int b = 50;
//		public void aa() {
//			System.out.println(a);
//			System.out.println(b);
//			System.out.println();
//		}
//		//public static void bb() {}
//	}
//	static class InstanceInner {
//		int a = 10;
//		static int c = 10;
//		public void aa() {
//			System.out.println(b);
//			testMethod2();
//		}
//		public static void bb() {}
//		
//	}
}

public class InnerClassAccessExam {
	public static void main(String[] args) {
		Test t = new Test();
		//Test.InstanceInner b = new Test.InstanceInner();
		//b.aa();
	}
}