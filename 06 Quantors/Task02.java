//Проверить, что в массиве целых чисел все положительные числа содержат хотя бы одну четную цифру.


public class Task02 {
	
	public static boolean hasOddDigit(int x) {
		while (x > 0) {
			int d = x % 10;
			if (d % 2 == 0) {
				return true;
			}
			x = x / 10;
		}
		return false;
	}
	
	public static boolean check(int [] a) {
		for (int x : a) {
			if (x > 0 && !hasOddDigit(x)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String [] args) {
		
		int [] a = {10, 20, 10, 20, 31, -100, 200};
		System.out.println(check(a));
		
	}
	
}