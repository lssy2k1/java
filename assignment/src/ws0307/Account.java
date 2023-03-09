package ws0307;

public class Account {
	private String accNo;
	private String name;
	private String accHolder;
	private double balance;
	public Account() {
		this.accNo = MakeAccountNum.makeAccountNum();
	}
	
	public Account(String name, String accHolder, double balance) throws MinusException {
		this();
		this.name = name;
		this.accHolder = accHolder;
		if (balance < 0) {
			throw new MinusException("마이너스오류!");
		}
		this.balance = balance;
	}

	//constructor - 음수 예외 상황
	public Account(String accNo, String name, String accHolder, double balance) throws MinusException {
		this.accNo = accNo;
		this.name = name;
		this.accHolder = accHolder;
		if (balance < 0) {
			throw new MinusException("마이너스오류!");
		}
		this.balance = balance;
	}
	
	//계좌 정보 조회
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", accHolder=" + accHolder + ", balance=" + balance + "]";
	}
	
	//잔액 조회
	public double getBalance() {
		return balance;
	}

	//입금 - 음수 예외 상황
	public void deposit(double money) throws MinusException{
		if (money < 0) {
			throw new MinusException("마이너스오류!");
		}
		balance += money;
		System.out.printf("%4.1f원 입금되었습니다. 잔액은 %4.1f입니다.\n", money, balance);
	}
	
	//출금 - 잔액 부족 예외 상황, 음수 예외 상황
	public void withdraw(double money) throws MinusException, EnoughException{
		if(money < 0) {
			throw new MinusException("마이너스오류!");
		}
		if(balance - money < 0) {
			throw new EnoughException("잔액부족오류!");
		}
		balance -= money;
		System.out.printf("%4.1f원 출금되었습니다. 잔액은 %4.1f원입니다.\n", money, balance);
	}
}
