package exercise12;

public class ThreadD extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadD �۾� ����");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadD ����");
	}
}
