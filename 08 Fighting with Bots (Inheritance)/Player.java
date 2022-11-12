public abstract class Player {
	
	private int hp;
	private String name;
	
	public Player(String name) {
		this.name = name;
		this.hp = Helper.MAX_HP;
	}
	
	public boolean isAlive() {
		return hp > 0;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHP() {
		return hp;
	}
	
	public abstract int decide(Player p);
	
	public void kick(Player p) {
		
		int f = this.decide(p);
		
		if (Helper.checkIfHit(f)) {
			p.hp -= f;
			System.out.println(this.name + " kicked " + p.name + " with force " + f);
			System.out.println(p.name + " HP is now " + p.hp);
		} else {
			System.out.println(this.name + " missed.");
		}
	}
	
}