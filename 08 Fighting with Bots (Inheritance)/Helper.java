public class Helper {
	
	public static final int MAX_HP = 40;
	
	public static final int FINISH_HIM = 5;
	
	public static checkIfHit(int f) {
		return Math.random() < 1 - 0.1 * f;
	}
	
}