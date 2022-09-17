/**
	@author: Volodya
*/
import java.util.Scanner;

public class Task18 {
	
	public static void main(String [] args) {
	
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int k = 2;
		int t = 1;
		int result = 0;
		for (int i = 1; i <= n; i++) {
			t *= k;
			result += t;
		}
		System.out.println(result);
	}
}