package step08_Thread;

public class DeamonThreadExam {
	public static void main(String[] args) {
		System.out.println("==메인 시작==");
		Thread th = new Thread() {
			public void run() {
				while(true) {
					System.out.println("안녕");
					try {
						Thread.sleep(100);
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
			};
		};
		
		th.setDaemon(true);
		th.start();
		
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("==메인 끝==");
	}
}
