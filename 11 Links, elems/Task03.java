public class Task03 {
	
	public static void main(String [] args) {
		
		
		// for (int i = 0; i < n - 1; i++) {
		for (Elem p = head; p.next != null; p = p.next) {
		
			// iMax = i;
			Elem pMax = p;
			
			// for (int j = i + 1; j < n; j++) {
			for (Elem q = p.next; q != null; q = q.next) {
				
				//if a[j] > a[iMax] {
				if (q.value > pMax.value) {	
					//iMax = j;
					pMax = q;
				}
			}
			/*
			int h = a[i];
			a[i] = a[iMax];
			a[iMax] = h;
			*/
			
			int h = p.value;
			p.value = pMax.value;
			pMax.value = h;
			
		}
		
		
	}
	
	
	
	
}