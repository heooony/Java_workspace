package exercise12;

public class YieldExample {
	public static void main(String[] args) {
		ThreadC threadC = new ThreadC();
		ThreadD threadD = new ThreadD();
		
		threadC.start();
		threadD.start();
		
		try { Thread.sleep(3000); } catch(InterruptedException e) {}
		threadC.work = false;
		
		try { Thread.sleep(3000); } catch(InterruptedException e) {}
		threadC.work = true;

		try { Thread.sleep(3000); } catch(InterruptedException e) {}
		threadC.stop = true;
		threadD.stop = true;
	}
}
