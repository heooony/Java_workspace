class Parent {
	Parent() {
		System.out.println(1);
	}
	Parent(int i) {
		System.out.println(2);
	}
	Parent(String s) {
		System.out.println(3);
	}
}

class Child extends Parent {
	Child() {
		System.out.println(4);
	}
	Child(int i) {
		System.out.println(5);
	}
	Child(boolean b) {
		System.out.println(6);
	}
}

class SuperConstructorExam {
	public static void main(String[] args) {
		new Child();
	}
}