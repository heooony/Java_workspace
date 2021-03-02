package exercise12;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();
		
		ThreadE threadE = new ThreadE(sharedObject);
		ThreadF threadF = new ThreadF(sharedObject);
		
		threadE.start();
		threadF.start();
	}
}