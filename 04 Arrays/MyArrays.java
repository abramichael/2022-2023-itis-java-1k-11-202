import java.util.Random;
public class MyArrays {
	
	public static void main(String [] args) {
		
		int n = 10;
		final int randomBound = 10;
		int [] a = new int[n];
		
		// a.length == n
		
		Random r = new Random();
		
		for (int i = 0; i < n; i++) {
			// r.nextInt(10); // from 0 to 9
			a[i] = r.nextInt(2 * randomBound + 1) - randomBound;
		}
		//
		System.out.println(a);
		/*
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		*/
		for (int elem : a) {
			//does not work
			elem = 10;
			System.out.print(elem + " ");
			
		}

	}
	
	
	
}