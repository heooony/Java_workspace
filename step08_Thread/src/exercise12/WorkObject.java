package exercise12;

public class WorkObject {
	public synchronized void methodE() {
		System.out.println("ThreadE�� methodE() �۾� ����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodF() {
		System.out.println("ThreadF�� methodF() �۾� ����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
}