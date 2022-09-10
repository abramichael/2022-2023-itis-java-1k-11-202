public class Task09 {
	
	public static void main(String [] args) {
		
		// TOP DOWN
		int k = Integer.parseInt(args[0]);
		int d = 2;
		
		while (d <= 9) {
			int m = k * d;
			System.out.println(d + " x " + k + " = " + m);
			d += 1;
		
		}
	
	}

}