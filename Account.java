package com.oop;

public class Account {
	private double balance;
	
	public Account() {
		balance = 0.0;
		
	}
	public Account(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
	balance+=amount;
	System.out.println("Deposited :"+amount);
	}
	
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance -= amount;
			System.out.println("Withdrawn : "+amount);
		}
		else {
			System.out.println("Insufficient balance ! ");
			}
	}
	public void displayBalance() {
		System.out.println("Current Balance : "+balance);
		
	}

	
}
