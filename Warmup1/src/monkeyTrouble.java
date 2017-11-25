/**
 * @author Arunkumaar
 *
 */
public class monkeyTrouble {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		System.out.println(monkey(true, true));
		System.out.println(monkey(false, false));
		System.out.println(monkey(true, false));
	}

	public static boolean monkey(boolean aSmile, boolean bSmile) {
		if (aSmile == true && bSmile == true) {
			return true;
		} else if (aSmile == false && bSmile == false) {
			return true;
		} else {
			return false;
		}
	}
}
