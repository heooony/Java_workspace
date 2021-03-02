package sample02;

class FullTime extends Employee{
	private int salary;
	private int bonus;

	public FullTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int salary, int bonus) {
		super(empNo, eName, job, mgr, hiredate, deptName);
		this.salary = salary;
		this.bonus = bonus;
	}
	public int getSalary() {return salary;}
	public void setSalary(int salary) {this.salary = salary;}
	public int getBonus() {return bonus;}
	public void setBonus(int bonus) {this.bonus = bonus;}
	public void message() {System.out.println(geteName() + "����� �������Դϴ�.");}

	@Override
	public String toString() {
		return super.toString() + "FullTime [salary=" + salary + ", bonus=" + bonus + "]";
	}
}