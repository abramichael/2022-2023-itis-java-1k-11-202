import java.util.Random;

public class NotDummyBot extends Player {
	
	private Random r = new Random();
	
	public NotDummyBot(String name) {
		super(name);
	}
	
	public int decide(Player p) {
		if (p.getHP() < Helper.FINISH_HIM) {
			return p.getHP();
		} else {
			int rad = p.getHP() < 9 ? p.getHP() : 9;
			return r.nextInt(rad) + 1;	
		}
		
	}
	
}