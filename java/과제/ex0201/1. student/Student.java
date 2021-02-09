

//학생의 정보를 저장, 조회, 변경 객체
//(학번, 이름, 나이, 주소)
//private으로 변수선언하여 set, get 메소드를 사용한다.
class Student {
	private int sno;
	private String name;
	private int age;
	private String addr;

	public void setSno(int sno) {
		this.sno = sno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getSno() {
		return sno;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddr() {
		return addr;
	}
}