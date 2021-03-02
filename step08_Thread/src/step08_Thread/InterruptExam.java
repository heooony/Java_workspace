package step08_Thread;

public class InterruptExam {
	public static void main(String[] args) {
		System.out.println("=====���� ����=====");
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while(true) {
						System.out.println("�ȳ�");
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
		
		System.out.println("=====���� ��=====");
	}
}
