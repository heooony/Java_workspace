class Account{

	int balance;
	int MIN_BALANCE;
	int MAX_BALANCE;

	Account() {
		balance = 0;
		MIN_BALANCE = 0;
		MAX_BALANCE = 1000000;
	}

	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE)
			this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
}

class Exercise19 {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());

		account.setBalance(-100);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());

		account.setBalance(2000000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());

		account.setBalance(300000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
	}
}