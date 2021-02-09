class Member {
	private String name;
	private String id;
	private String password;
	private int age;

	Member() {}
	Member(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public void print() {
		System.out.println("name : " + name);
		System.out.println("id : " + id);
		System.out.println("password : " + password);
		System.out.println("age : " + age);
	}
}

class Exercise13_14{
	public static void main(String[] args) {
		Member user1 = new Member("홍길동", "hong");
		user1.print();
		System.out.println();
		Member user2 = new Member("강자바", "java");
		user2.print();
	}
}