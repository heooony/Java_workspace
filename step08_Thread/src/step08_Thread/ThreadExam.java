package step08_Thread;

class ThreadExam extends Thread {
	public static void main(String[] args) {
		NumberThread th1 = new NumberThread("ù��° Thread");
		
		AlphaThread alphath = new AlphaThread();
		Thread th2 = new Thread(alphath, "�ι�° Thread");
		th1.setPriority(MAX_PRIORITY);
		th2.setPriority(MIN_PRIORITY);
	
		th1.start();
		th2.start();
		
		try {
			th1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("���� : " + th1.sum);
		System.out.println("========main��=========");
	}
}

class NumberThread extends Thread {
	int sum;
	public NumberThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.println(super.getName() + " => " + i + " " + super.getPriority());
			sum += i;
		}
		
		System.out.println(super.getName() + "End");
	}
}

class AlphaThread implements Runnable {
	@Override
	public void run() {
		Thread th = Thread.currentThread();
		for(char ch='A'; ch <= 'Z'; ch++) {
			System.out.println(th.getName() + " => " + ch + " " + th.getPriority());
		}
	}
}