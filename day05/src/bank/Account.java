package bank;

public class Account {
	private String accNum;
	private String accName;
	private double balance;

	public Account() {// 여기다 계좌번호 만드는 로직을 작성하면 길어진다. 따라서 따로 class를 만들어서 쓰자.
		// MakeAccountNumber makenum = new MakeAccountNumber();
		this.accNum = MakeAccountNumber.makeAccNum();// static class의 경우 인스턴스 생성 없이 함수를 사용 가능!
	}

	public Account(String accName, double balance) {
		this();
		this.accName = accName;
		this.balance = balance;
	}

	public Account(String accNum, String accName, double balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + "]";
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double money) {
		if (money <= 0) {
			System.out.println("출금금액을 확인하세요.");
			return;
		}
		if (money > balance) {
			System.out.println("잔액을 확인하세요.");
			return;
		}
		this.balance -= money;
		System.out.printf("잔액은 %4.1f 입니다.\n", balance);

	}

	public void deposit(double money) {
		if (money <= 0) {
			System.out.println("입금금액을 확인하세요");
			return;
		}
		this.balance += money;
		System.out.printf("잔액은 %4.1f 입니다.\n", balance);
	}
}
