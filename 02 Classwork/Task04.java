public class Task04 {
	
	public static void main(String[] args) {
		
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		
		// haha that's false
		// System.out.println((2.0 - 1.1) == 0.9);
		
		double final EPS = 0.0000001;
		
		boolean result = Math.abs(a - b) < EPS;
		
		System.out.println(result);
	}
	
}