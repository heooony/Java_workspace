package sample02;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee employee [] = new Employee[5];
		employee[0] = new FullTime(10, "���缮", "���׿��", 0 , "2013-05-01", "���ѵ���",8500,200);
		employee[1] = new FullTime(20, "�ڸ��", "����",10, "2013-06-20", "���ѵ���",7500,100);
		employee[2] = new FullTime(30, "������", "������",10 , "2013-06-22", "���ѵ���",6000,0);
		employee[3] = new PartTime(40, "��ȫö", "������",20 , "2014-05-01", "���ѵ���",20000);
		employee[4] = new PartTime(50, "����", "����",30 , "2014-05-02", "���ѵ���",25000);
		
		System.out.println("------------Emp ����------------");
		
		for(Employee ee : employee) System.out.println(ee);
	
		System.out.println();
		System.out.println("------------Message------------");

		for(Employee ee : employee) ee.message();

	}
}