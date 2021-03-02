package exercise12;

public class ThreadD extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadD 작업 내용");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadD 종료");
	}
}
