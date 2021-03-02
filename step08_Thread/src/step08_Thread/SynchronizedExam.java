package step08_Thread;

public class SynchronizedExam {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		new CustomerThread("생산자", true, bank).start();
		new CustomerThread("소비자", false, bank).start();
	}
}

class Bank {
	int balance;
	
	public synchronized void balanceChane(String name, boolean state) {
		if(state) {
			if(balance >= 0) {
				System.out.print(name + "==> 현재 잔액 : " + balance + ", ");
				balance++;
				System.out.println(name + "==> 증가 후 잔액 : " + balance);
			} else {
				try {
					System.out.println(name +"님 대기중입니다.");
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} else {
			if(balance>0) {
				System.out.print(name + "==> 현재 잔액 : " + balance + ", ");
				balance--;
				System.out.println(name + "==> 증가 후 잔액 : " + balance);
			} else {
				try {
					System.out.println(name +"님 대기중입니다.");
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		notifyAll(); //wait()에 의해 중지 중인 모든 스레드를 준비상태로 만든다.
	}
}

class CustomerThread extends Thread {
	String name;
	boolean state;
	Bank bank;
	
	public CustomerThread(String name, boolean state, Bank bank) {
		super(name);
		
		this.name = name;
		this.state = state;
		this.bank = bank;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			bank.balanceChane(name, state);
		}
	}
}