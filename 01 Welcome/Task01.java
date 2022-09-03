import java.util.Scanner;

public class Task01 {
	
	public static void main(String [] args) {
		
		// тип имя;
		// тип имя = значение;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int s = 0;
		int i = 1;
		while (i <= n) {
			System.out.println("Enter next number");
			s = s + sc.nextInt();
			i = i + 1;
		}
		System.out.println("Sum:");
		System.out.println(s);
	
	}
	
}