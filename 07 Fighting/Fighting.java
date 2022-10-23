import java.util.Scanner;

public class Fighting {

	public static int getF(p, Scanner sc) {
		int f = 0;
		do {
			System.out.println(p.getName() + " turn>");
			f = sc.nextInt();
		} 
		while (f < 1 || f > 9);
		return f;
	}
	
	public static void main(String [] args) {
		
		final int MAX_HP = 40;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter player 1 name");
		String name = sc.nextLine();
		
		Player p1 = new Player(name, MAX_HP);
		
		System.out.println("Enter player 2 name");
		name = sc.nextLine();
		
		Player p2 = new Player(name, MAX_HP);
				
		while (p1.isAlive() && p2.isAlive()) {
			
			int f = getF(p1, sc)
			p1.kick(p2, f);
			
			Player p = p1;
			p1 = p2;
			p2 = p;
						
			/*
			int f = getF(p1, sc)
			p1.kick(p2, f);
			
			if (!p2.isAlive()) {
				continue;
			}
			
			f = getF(p2, sc)
			p2.kick(p1, f);
			*/
		}
		
	}
	
}