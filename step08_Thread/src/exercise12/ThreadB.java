package exercise12;

public class ThreadB extends Thread{
	public ThreadB() {
		setName("ThreadB");
	}
	
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(getName() + "�� ����� ����");
		}
	}
}
