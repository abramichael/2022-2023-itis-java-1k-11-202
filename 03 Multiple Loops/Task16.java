//16. Вывести таблицу умножения цифр от 2 до 9 - в виде таблицы.


public class Task16 {
	
	public static void main(String [] args) {
	
		int min = 2;
		int max = 9;
		int n = max - min + 1;
		int nSpacesInTab = 8;
		
		int d = min;
		while (d <= max) {
			
			int d2 = min;
			while (d2 <= max) {
				System.out.print(d2 * d + "\t|");
				
				d2 = d2 + 1;
			}
			System.out.println();
			
			for (int i = 0; i < n * nSpacesInTab; i++) {
				
				System.out.print("-");
				
			}
			System.out.println();
			
			d = d + 1;
		}
	}
	
}