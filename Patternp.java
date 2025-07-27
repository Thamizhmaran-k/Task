import java.util.Scanner;
public class Patternp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
			if(j<i){
				System.out.print(n-j-1);
			}
			else {
				System.out.print(n-i);
			}
		}
		System.out.println();
	  }
		scan.close();
	}
 }
