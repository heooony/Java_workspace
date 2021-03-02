package exercise12;

public class ThreadE extends Thread{
	private WorkObject workObject;
	
	public ThreadE(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			workObject.methodE();
		}
	}
}
