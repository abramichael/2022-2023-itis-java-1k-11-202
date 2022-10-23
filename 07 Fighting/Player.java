public class Player {
	
	private int hp;
	private String name;
	
	public Player(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public boolean isAlive() {
		return hp > 0;
	}
	
	public String getName() {
		return name;
	}
	
	public void kick(Player p, int f) {

		if (Math.random() < 1 - 0.1 * f) {
			// p.setHP(p.getHP() - f);
			p.hp -= f;
			System.out.println(this.name + " kicked " + p.name + " with force " + f);
			System.out.println(p.name + " HP is now " + p.hp);
		} else {
			System.out.println(this.name + " missed.");
		}
	}
	
}