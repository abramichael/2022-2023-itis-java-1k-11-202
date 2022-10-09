// Проверить, что в строке (String) ровно 3 буквы ялвяются гласными.

public class Task01 {
	
	public static boolean isVowel(char c) {
		String vowels = "aeiouyAEIOUY";
		for (int i = 0; i < vowels.length(); i++) {
			if (vowels.charAt(i) == c) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean check(String s, int n) {
		
		int k = 0;
		int i = 0;
		while (i < s.length() && k <= n) {
			
			char c = s.charAt(i);
			if (isVowel(c)) {
				k += 1;
			}
			i += 1;
			
		}
		return k == n;
		
	}
	
	public static void main(String [] args) {
		
		String s = args[0];
		System.out.println(check(s, 3));
		
	}
	
	
}