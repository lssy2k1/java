package com.kbstar.dto;

public class AccountDTO {
	private String accNum;
	private double balance;
	private String holder;
	public AccountDTO() {
	}
	public AccountDTO(String accNum, double balance, String holder) {
		this.accNum = accNum;
		this.balance = balance;
		this.holder = holder;
	}
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	@Override
	public String toString() {
		return "AccountDTO [accNum=" + accNum + ", balance=" + balance + ", holder=" + holder + "]";
	}
	
}
