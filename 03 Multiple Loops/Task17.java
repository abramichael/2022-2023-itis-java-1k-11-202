/**
	@author: Emil
*/

public class Task17 {
	
	public static void main(String [] args) {
	
			int n = Integer.parseInt(args[0]);
			
			int t = 1;
			int s = 0;
			int i = 1;
			
			long d2 = System.nanoTime();
			while (i <= n) {
				t *= n;
				s += t;
				i++;
			}
			long d3 = System.nanoTime();
			
			System.out.println(d3 - d2);
			
			System.out.println(s);

	}
}