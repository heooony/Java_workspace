package ex0210;

public class Student {
	private int sno;
	private String name;
	private int age;
	private String addr;
	
	public Student(int sno, String name, String addr) {
		this.sno = sno;
		this.name = name;
		this.addr = addr;
	}
	
	public Student(int sno, String name, int age, String addr) {
		this(sno, name, addr);
		this.age = age;
	}
	
	public int getSno() {return sno;}
	public void setSno(int sno) {this.sno = sno;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public String getAddr() {return addr;}
	public void setAddr(String addr) {this.addr = addr;}
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
}
