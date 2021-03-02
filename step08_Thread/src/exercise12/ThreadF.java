package exercise12;

public class ThreadF extends Thread{
	private WorkObject workObject;
	
	public ThreadF(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			workObject.methodF();
		}
	}
}
