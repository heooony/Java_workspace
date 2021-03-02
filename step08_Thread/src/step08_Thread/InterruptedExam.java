package step08_Thread;

public class InterruptedExam {
	public static void main(String[] args) {
		System.out.println("=====메인 시작=====");
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
					while(true) {
						if(Thread.interrupted())
							break;
						System.out.println("안녕");
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
