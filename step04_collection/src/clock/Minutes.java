package clock;

public class Minutes extends Seconds{
	int minutes;
	@Override
	public void waitTime() throws Exception {
		super.waitTime();
		if(seconds == 60) {
			seconds = 0;
			minutes++;
		}
	}
	
//	public void printWithMinutes() {
//		System.out.println(minutes + " : " + seconds);
//	}
	
	@Override
	public void print() {
		System.out.println(getClass());
		if(!(this instanceof Minutes)) {
			super.print();
		} else {
			System.out.println(minutes + " : " + seconds);
		}
	}
}
