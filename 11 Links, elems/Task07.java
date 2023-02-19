public class Task07 {
	
	public static void main(String [] args) {
		
		int x = 100;
		while (head.next != null & head.value == x) {
			head = head.next;
		}
		// остался только один элемент
		if (head.next == null) {
			if (head.value == x) {
				head = null;
			}
		}
		// осталось как минимум 2 элемента
		else { 
			Elem p = head;
			while (p.next != null) {
				if (p.next.value == x) {
					p.next = p.next.next;
				} else {
					p = p.next;
				}
			}
		}
	}
	
}








