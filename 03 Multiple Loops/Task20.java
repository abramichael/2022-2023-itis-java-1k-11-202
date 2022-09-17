// 20. Подсчитать сумму слагаемых (k! * x^k) для k от 1 до n. x - вещественное.

import java.util.Scanner;

public class Task20 {
	
	public static void main(String [] args) {
	
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double x = in.nextDouble();
		
		double result = 0.0;
		long f = 1;
		double d = 1;
		
		int k = 1;
		while (k <= n) {
			f = f * k;
			d = d * x;
			result = result + d * f;
			
			k += 1;
		}
	
		System.out.println(result);
	}
}