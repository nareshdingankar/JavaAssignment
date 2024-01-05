package com.account;

public class Account {
	
	// Creating Fields
	private String accountId;
	private String accountType;
	private double accountBalance;
	
	// Constructor
	public Account(String accountId, String accountType, double accountBalance) {
		this.accountId = accountId;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	
	// Deposit
	public void deposit(double amount) {
		// assignment operator
		accountBalance += amount;
//		accountBalance = accountBalance + amount ;
	}
	
	// Withdraw
	public void withdraw(double amount) {
		if(amount <= accountBalance)
		{
			// assignment operator
			accountBalance -= amount;
//			accountBalance = accountBalance - amount;
		}
		
		else
		{
			System.out.println("Insufficient account balance");
		}
	}
	
	// Get Balance
	public double getAccountBalance() {
		return accountBalance;
	}
	
	// Display Details
	void display() {
		System.out.println("Account ID is " + accountId);
		System.out.println("Account Type is " + accountType);
		System.out.println("Account Balance is " + accountBalance);
	}
}
