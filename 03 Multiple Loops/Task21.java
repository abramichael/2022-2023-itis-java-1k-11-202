import java.util.Scanner;

public class Task21 {
	
	public static void main(String [] args) {
	
		Scanner in = new Scanner(System.in);
		final double EPS = 1e-12; // 0.0000001
		double x = in.nextDouble();
		
		double result = 0.0;
		int k = 0;
		double a = 1;
		result += a;
		k += 1;
		
		while (Math.abs(a) > EPS) {
			a = a * x / k;
			result += a;
			System.out.println("a = " + a);
			System.out.println("result = " + result);
			k++;
		}
	
		System.out.println(result);
	}
}