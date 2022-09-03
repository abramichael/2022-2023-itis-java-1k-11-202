public class Task02 {
	
	public static void main(String [] args) {
		
		double x = -3;
		double y = 0;
		
		if ((x * x + (y + 2) * (y + 2) <= 4) || 
		((x < 0) && (x * x + y * y <= 16) && (x * x + (y - 2)*(y - 2) > 4))
		) {
			System.out.println("In");
		} else {
			System.out.println("Out");
		}
		
	}
	
}