import java.util.Scanner;

class Account {
	private String ano;
	private String owner;
	private int balance;

	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() { return ano; }
	public void setAno(String ano) { this.ano = ano; }
	public String getOwner() { return owner; }
	public void setOwner(String owner) { this.owner = owner; }
	public int getBalance() { return balance; }
	public void setBalance(int balance) { this.balance = balance; }
}

public class Exercise20 {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int count = 0;

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if(selectNo == 1)
				createAccount();

			else if(selectNo == 2)
				accountList();

			else if(selectNo == 3)
				deposit();

			else if(selectNo == 4)
				withdraw();

			else if(selectNo == 5)
				run = false;
			
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {

		printTitle("계좌생성");
		System.out.print("계좌번호 : ");
		String ano = scanner.next();

		System.out.print("계좌주 : ");
		String owner = scanner.next();

		System.out.print("초기입금액 : ");
		int balance = scanner.nextInt();

		Account account = new Account(ano, owner, balance);

		if(account != null) {
			accountArray[count++] = account;
			System.out.println("결과 : 계좌가 생성되었습니다.");
		}
		else
			System.out.println("예상치 못한 오류가 발생했습니다.");

		clearScreen();
	}

	private static void accountList() {

		printTitle("계좌목록");
		if(count == 0)
			System.out.println("계좌 목록이 존재하지 않습니다.");
		for(int i = 0; i < count; i++)
			System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		
		clearScreen();
	}

	private static void deposit() {
		
		printTitle("예금");
		System.out.print("계좌번호 : ");
		String ano = scanner.next();

		Account account = findAccount(ano);

		if(account != null) {
			System.out.print("예금액 : ");
			int balance = scanner.nextInt();
			account.setBalance(account.getBalance() + balance);
			System.out.println("결과 : 예금이 성공되었습니다.");
		} else
			System.out.println("일치하는 계좌를 찾을 수 없습니다.");

		clearScreen();
		
	}

	private static void withdraw() {
		printTitle("출금");
		System.out.print("계좌번호 : ");
		String ano = scanner.next();

		Account account = findAccount(ano);

		if(account != null) {
			System.out.print("출금액 : ");
			int balance = scanner.nextInt();
			if(account.getBalance() >= balance) {
				account.setBalance(account.getBalance() - balance);
				System.out.println("결과 : 출금이 성공되었습니다.");
			} else
				System.out.println("결과 : 출금에 실패했습니다.");

		} else
			System.out.println("일치하는 계좌를 찾을 수 없습니다.");

		clearScreen();
		
	}

	private static Account findAccount(String ano) {
		for(int i = 0; i < count; i++)
			if(ano.equals(accountArray[i].getAno()))
				return accountArray[i];
		return null;
	}
	
	private static void printTitle(String title) {
		System.out.println("-----------");
		System.out.println(title);
		System.out.println("-----------");
	}

	private static void clearScreen() {
		for(int i = 0; i < 5; i++)
			System.out.println();
	}
}