package exercise12;

public class WorkObject {
	public synchronized void methodE() {
		System.out.println("ThreadE의 methodE() 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodF() {
		System.out.println("ThreadF의 methodF() 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
}