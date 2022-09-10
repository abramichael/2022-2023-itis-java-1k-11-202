public class Task12 {
	
	public static void main(String[] args) {
		
		long x = Long.parseLong(args[0]);
		// count system base
		int csb = 2;
		long n = 0;
		int k = 1;
		while (x > 0) {
			
			long d = x % 10;
			
			n = n + d * k;
			
			k = k * csb;
			
			x = x / 10;
			
		}
		System.out.println(n);
	}
}