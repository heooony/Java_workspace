package exercise12;

public class PrintThread2 extends Thread {
	public void run() {
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) {
				break;
			}
		}
//		try {
//			while(true) {
//				System.out.println("실행 중");
//				Thread.sleep(1);
//			}
//		} catch(InterruptedException e) {
//			
//		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}