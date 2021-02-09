class FullTime{
	private int empNo;
	private String eName;
	private String job;
	private int mgr;
	private String hiredate;
	private String deptName;
	private int salary;
	private int bonus;

	FullTime() {}
	FullTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int salary, int bonus) {
		this.empNo = empNo;
		this.eName = eName;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.deptName = deptName;
		this.salary = salary;
		this.bonus = bonus;
	}

	public int getEmpNo() { return empNo; }
	public String geteName() { return eName; }
	public String getJob() { return job; }
	public int getMgr() { return mgr; }
	public String getHiredate() { return hiredate; }
	public String getDeptName() { return deptName; }
	public int getSalary() { return salary; }
	public int getBonus() { return bonus; }

	public void setEmpNo(int empNo) { this.empNo = empNo; }
	public void seteName(String eName) { this.eName = eName; }
	public void setJob(String job) { this.job = job; }
	public void setMgr(int mgr) { this.mgr = mgr; }
	public void setHiredate(String hiredate) { this.hiredate = hiredate; }
	public void setDeptName(String deptName) { this.deptName = deptName; }
	public void setSalary(int salary) { this.salary = salary; }
	public void setBonus(int bonus) { this.bonus = bonus; }

	public void message() {
		System.out.println(eName + "사원은 정규직입니다.");
	}
	public String toString() {
		return (empNo + " | " + eName + " | " + job + " | " + mgr + " | " + hiredate + " | " + deptName + " | " + salary + " | " + bonus);
	}
}
