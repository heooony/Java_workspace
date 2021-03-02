package step08_Thread;

public class InterruptedExam {
	public static void main(String[] args) {
		System.out.println("=====���� ����=====");
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
					while(true) {
						if(Thread.interrupted())
							break;
						System.out.println("�ȳ�");
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
		
		System.out.println("=====���� ��=====");
	}
}
