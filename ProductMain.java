package com.oop;
import java.util.Scanner;
public class ProductMain {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
        Product[] products = new Product[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Product ID, Price, Quantity:");
            int pid = scan.nextInt();
            double price = scan.nextDouble();
            int quantity = scan.nextInt();
            products[i] = new Product(pid, price, quantity);
        }
        
        double maxPrice = products[0].price;
        int maxPid = products[0].pid;
        for (Product p : products) {
            if (p.price > maxPrice) {
                maxPrice = p.price;
                maxPid = p.pid;
            }
        }
        System.out.println("Product ID with highest price: " + maxPid);
        double total = calculateTotal(products);
        System.out.println("Total amount spent: " + total);
    }

    public static double calculateTotal(Product[] products) {
        double sum = 0;
        for (Product p : products) {
            sum += p.price * p.quantity;
        }
        return sum;
       
    }
}