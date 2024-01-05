package com.account;

import java.util.Scanner;

import com.account.Account;

public class AccountMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// printing account Id
		System.out.print("Enter Account ID: ");
		String accountId = sc.nextLine();
		
		// printing account type
		System.out.print("Enter Account Type: ");
		String accountType = sc.nextLine();
		
		// printing account balance
		System.out.print("Enter Account Balance: ");
		double accountBalance = sc.nextDouble();
		
		   // Account initialization
			Account account = new Account(accountId, accountType, accountBalance);
			
			// A menu is displayed for the user to select an operation (deposit, withdraw, display balance, or exit).
			int choice ;
			do {
				System.out.println("1. Depoit");
				System.out.println("2. Withdraw");
				System.out.println("3. Display Balance");
				System.out.println("4. Exit");
				System.out.print("Enter your choice: ");
				choice = sc.nextInt();
			
			// switch cases for select particular operation	
			switch(choice) {
			case 1:
				System.out.print("Enter deposit amount: Rs.");
				int depositAmount = sc.nextInt();
				account.deposit(depositAmount);
				break;
			case 2:
				System.out.print("Enter withdrawal amount: Rs.");
				int withdrawAmount = sc.nextInt();
				account.withdraw(withdrawAmount);
				break;
			case 3:
				System.out.println("Current Balance: Rs." + account.getAccountBalance());
				break;
			case 4:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid choice.");
			}
		}
		
		// choice is not equal to 4, till this loop will run
		// if choice = 4 loop will exit
		while(choice != 4);
		
		sc.close();
	}
}
