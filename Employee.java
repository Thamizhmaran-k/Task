package oop;

public class Employee implements Taxable {
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public void calcTax() {
        double tax = salary * incomeTax;
        System.out.println("Income Tax for " + name + " is: " + tax);
    }
}
