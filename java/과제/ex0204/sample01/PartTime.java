class PartTime{
	private int empNo;
	private String eName;
	private String job;
	private int mgr;
	private String hiredate;
	private String deptName;
	private int timePay;

	PartTime() {}
	PartTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int timePay) {
		this.empNo = empNo;
		this.eName = eName;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.deptName = deptName;
		this.timePay = timePay;
	}

	public int getEmpNo() { return empNo; }
	public String geteName() { return eName; }
	public String getJob() { return job; }
	public int getMgr() { return mgr; }
	public String getHiredate() { return hiredate; }
	public String getDeptName() { return deptName; }
	public int getTimePay() { return timePay; }

	public void setEmpNo(int empNo) { this.empNo = empNo; }
	public void seteName(String eName) { this.eName = eName; }
	public void setJob(String job) { this.job = job; }
	public void setMgr(int mgr) { this.mgr = mgr; }
	public void setHiredate(String hiredate) { this.hiredate = hiredate; }
	public void setDeptName(String deptName) { this.deptName = deptName; }
	public void setTimePay(int timePay) { this.timePay = timePay; }

	public void message() {
		System.out.println(eName + "사원은 비정규직입니다.");
	}
	public String toString() {
		return (empNo + " | " + eName + " | " + job + " | " + mgr + " | " + hiredate + " | " + deptName + " | " + timePay);
	}
}
