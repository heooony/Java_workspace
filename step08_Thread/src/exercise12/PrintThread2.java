package exercise12;

public class PrintThread2 extends Thread {
	public void run() {
		while(true) {
			System.out.println("���� ��");
			if(Thread.interrupted()) {
				break;
			}
		}
//		try {
//			while(true) {
//				System.out.println("���� ��");
//				Thread.sleep(1);
//			}
//		} catch(InterruptedException e) {
//			
//		}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}