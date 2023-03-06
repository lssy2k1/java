package com.kbstar.dto;

public class AccountDTO {
	private String accNum;
	private String accName;
	private double balance;

	public AccountDTO() {
		//'makeaccountnum'을 '유틸리티'라고 한다. 기능들을 회사에서 미리 만들어놓고 사용. 있었다가 지움.
	}

	public AccountDTO(String accNum, String accName, double balance) {
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
