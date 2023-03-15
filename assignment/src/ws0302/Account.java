package ws0302;

public class Account {
	private String accNum;
	private String accName;
	private double balance;
	private double rate;
	private String grade;

	//getter setter
	
	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccNum() {
		return accNum;
	}

	public double getBalance() {
		return balance;
	}

	public double getRate() {
		return rate;
	}

	public String getGrade() {
		return grade;
	}

	//constructor
	
	public Account() {
		this.accNum = MakeAccountNumber.makeAccNum();
	}

	public Account(String accName, double balance, double rate, String grade) {
		this();
		this.accName = accName;
		this.balance = balance;
		this.rate = rate;
		this.grade = grade;
	}

	public Account(String accNum, String accName, double balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}

	//method
	
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + ", rate=" + rate
				+ ", grade=" + grade + "]";
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
		System.out.printf("잔액은 %4.0f 입니다.\n", balance);

	}

	public void deposit(double money) {
		if (money <= 0) {
			System.out.println("입금금액을 확인하세요");
			return;
		}
		this.balance += money;
		System.out.printf("잔액은 %4.0f 입니다.\n", balance);
	}

	public double getInterest() {
		double result = 0.0;
		result = rate * balance;
		return result;
	}
}
