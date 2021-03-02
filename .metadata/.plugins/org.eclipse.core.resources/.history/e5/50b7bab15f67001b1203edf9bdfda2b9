class PartTime extends Employee{
	private int timePay;

	PartTime() {}
	PartTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int timePay) {
		super(empNo, eName, job, mgr, hiredate, deptName);
		this.timePay = timePay;
	}

	public int getTimePay() { return timePay; }

	public void setTimePay(int timePay) { this.timePay = timePay; }

	public void message() {
		System.out.println(geteName() + "사원은 비정규직입니다.");
	}

	public String toString() {
		return super.toString() + " | " + timePay;
	}
}
