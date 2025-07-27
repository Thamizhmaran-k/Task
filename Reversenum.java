import java.util.Scanner;

public class Reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int r = 0;
		
		while(n!=0) {
			int d = n%10;
			r=r*10+d;
			n=n/10;
		}
		
		System.out.println(""+r);
		scan.close();
	}
		
	}
