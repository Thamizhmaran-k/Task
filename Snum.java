import java.util.Scanner;
public class Snum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(b<a) {
			System.out.println(b);
		}
			
		else if(c<a) {
			System.out.println(c);
		}
		else {
			System.out.println(a);
		}
	}

}
