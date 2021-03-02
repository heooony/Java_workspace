package step08_Thread;

public class InterruptExam {
	public static void main(String[] args) {
		System.out.println("=====메인 시작=====");
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while(true) {
						System.out.println("안녕");
						Thread.sleep(300);
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		th.start();

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		th.interrupt();
		
		System.out.println("=====메인 끝=====");
	}
}
