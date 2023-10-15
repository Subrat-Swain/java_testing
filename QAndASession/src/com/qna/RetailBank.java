package com.qna;

public class RetailBank {
	
	// It is only accessable inside only this class or inherited class;
	
	private int balance;
	private String currency;
	private String branch;
	protected String ifscCode;
	private String bankName;
	private String userId;
	private String password;
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return this.balance;
	}
	public void setPassword(String password) {
		if(password.length() < 8) {
			System.out.println("Password should be atleaset 8 chars long");
		}else {
			this.password = password;
		}
	}
}
