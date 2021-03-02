package step08_Thread;

public class SynchronizedExam {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		new CustomerThread("������", true, bank).start();
		new CustomerThread("�Һ���", false, bank).start();
	}
}

class Bank {
	int balance;
	
	public synchronized void balanceChane(String name, boolean state) {
		if(state) {
			if(balance >= 0) {
				System.out.print(name + "==> ���� �ܾ� : " + balance + ", ");
				balance++;
				System.out.println(name + "==> ���� �� �ܾ� : " + balance);
			} else {
				try {
					System.out.println(name +"�� ������Դϴ�.");
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} else {
			if(balance>0) {
				System.out.print(name + "==> ���� �ܾ� : " + balance + ", ");
				balance--;
				System.out.println(name + "==> ���� �� �ܾ� : " + balance);
			} else {
				try {
					System.out.println(name +"�� ������Դϴ�.");
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		notifyAll(); //wait()�� ���� ���� ���� ��� �����带 �غ���·� �����.
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