package com.oop;

public class MainProgram {
	public static void main(String args[]) {
		PersonwithProperties p1 = new PersonwithProperties("Raj");
		p1.display();
		
		System.out.println();
		
		PersonwithProperties p2 = new PersonwithProperties("STR ");
		p2.display();
		Account myAccount = new Account(1000);
		myAccount.deposit(500);
		myAccount.withdraw(200);
		myAccount.displayBalance();
		
		System.out.println();
		
		Employee emp = new Employee("Raj", 25, 101, 50000.0);
		emp.display();
		
		System.out.println();
		Product[] products = new Product[2];
		products[0] = new Product(1,100.0,2);
		products[1]= new Product(2,150.0,3);
		
		double total = ProductMain.calculateTotal(products);
		System.out.println("Total spent on products: " +total);
	}

}
