import java.util.Scanner;

public class HumanPlayer extends Player{
	
	private Scanner sc = new Scanner(System.in);
	
	public HumanPlayer(String name) {
		super(name);
	}
	
	public int decide(Player p) {
		return sc.nextInt();
	}
	
}