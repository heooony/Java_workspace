import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bank bank = new Bank();
		boolean run = true;
		int choice = 0;

		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			choice = scanner.nextInt();
			switch(choice) {
				case 1:
					bank.deposit();
					break;
				case 2:
					bank.withdraw();
					break;
				case 3:
					System.out.println(bank.getBalance());
					break;
				case 4:
					System.exit(0);
			}
		}
		System.out.println("프로그램 종료");
	}
}

class Bank {
	private int balance = 0;
	Scanner scanner = new Scanner(System.in);

	public void deposit() {
		System.out.print("예금액> ");
		balance += scanner.nextInt();
	}

	public void withdraw() {
		System.out.print("출금액> ");
		int tempBalance = scanner.nextInt();
		if(balance < tempBalance)
			System.out.println("출금액이 더 큽니다.");
		else
			balance -= tempBalance;
	}

	public int getBalance() {
		return balance;
	}
}