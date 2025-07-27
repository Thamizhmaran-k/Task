import java.util.Scanner;
public class Amountf {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double amount = scan.nextDouble();
		double discount = 0;
		
		if(amount>=500 && amount<=1000) 
		{
			discount = amount*0.10;
		}
		
		else if(amount>500) 
		{
			discount = amount*0.20;
		} 
		    double finalamount = amount-discount;
			System.out.println("Final payable Amount : "+finalamount);
			scan.close();
	}

	 }

	
