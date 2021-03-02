package clock;

public class Seconds {
	int seconds = 0;
	
	public void waitTime() throws Exception {
		Thread.sleep(1000);
		seconds++;
	}
	
	public void print() {
		System.out.println(this.seconds);
	}
}