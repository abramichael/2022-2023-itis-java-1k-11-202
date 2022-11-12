import java.util.Random;

public class DummyBot extends Player {
	
	private Random r = new Random();
	
	public DummyBot(String name) {
		super(name);
	}
	
	public int decide(Player p) {
		return r.nextInt(9) + 1;		
	}
	
}