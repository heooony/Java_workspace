package clock;

public class MainApp {
	public static void main(String[] args) throws Exception {
		Seconds seconds = new Minutes();
		while(true) {
			seconds.waitTime();
			seconds.print();
		}
	}
}
