package ex0215_set;

public class Member {
	private String name;
	private int age;
	private String addr;
	
	public Member() {}

	public Member(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() { return name; }
	public void setName( String name) {this.name = name; }
	public int getAge() { return age; }
	public void setAge( int age) {this.age = age; }
	public String getAddr() { return addr; }
	public void setAddr(String addr) { this.addr = addr; }

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashCode 실행");
		return name.hashCode() + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals 실행");
		if(obj instanceof Member) {
			Member mb = (Member) obj;
			if(name.equals(mb.getName()) && age == mb.getAge()) {
				return true;
			}
		}
		return false;
	}
}
