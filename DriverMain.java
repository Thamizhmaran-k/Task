package oop;

import java.util.Scanner;

public class DriverMain {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Employee ID, Name, Salary: ");
        int empId = scan.nextInt();
        String name = scan.next();
        double salary = scan.nextDouble();
        Employee emp = new Employee(empId, name, salary);
        emp.calcTax();

        System.out.println("Enter Product ID, Price, Quantity: ");
        int pid = scan.nextInt();
        double price = scan.nextDouble();
        int qty = scan.nextInt();
        Product product = new Product(pid, price, qty);
        product.calcTax();
    }
}
