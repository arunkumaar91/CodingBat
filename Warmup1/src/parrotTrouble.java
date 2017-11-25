/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class parrotTrouble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(parrot(true, 6));
		System.out.println(parrot(true, 7));
		System.out.println(parrot(false, 6));
	}

	public static boolean parrot(boolean talk, int value) {
		if ((talk == true) && (value < 7 || value > 20)) {
			return true;
		} else {
			return false;
		}
	}
}
