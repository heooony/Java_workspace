package step08_Thread;

public class DeamonThreadExam {
	public static void main(String[] args) {
		System.out.println("==���� ����==");
		Thread th = new Thread() {
			public void run() {
				while(true) {
					System.out.println("�ȳ�");
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
		
		System.out.println("==���� ��==");
	}
}
