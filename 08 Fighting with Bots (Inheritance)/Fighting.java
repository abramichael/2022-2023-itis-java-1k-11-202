import java.util.Scanner;

public class Fighting {

	static Scanner sc = new Scanner(System.in);

	public static void main(String [] args) {
					
		System.out.println("Enter player 1 name");
		String name = sc.nextLine();
		
		Player p1 = new HumanPlayer(name);
		
		// режим
		System.out.println("Enter game mode:");
		int mode = sc.nextInt();
		Player p2 = null;
		switch (mode) {
			case 0:
				p2 = new DummyBot("Dummy");
				break;
			case 1:
				p2 = new NotDummyBot("Not Dummy");
				break;		
			default:
				p2 = new HumanPlayer("Player2");
		}
		
		while (p1.isAlive() && p2.isAlive()) {
			
			System.out.print(p1.getName() + " turn>");
			p1.kick(p2);
			
			// Поменяй местами для следующего шага
			
			Player p = p1;
			p1 = p2;
			p2 = p;
			
			System.out.println();
						
		}
		
	}
	
}