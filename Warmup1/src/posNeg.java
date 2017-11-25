/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class posNeg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pos(1, -1, false));
		System.out.println(pos(-1, 1, false));
		System.out.println(pos(-4, -5, true));
		System.out.println(pos(1, 1, true));
		System.out.println(pos(1, 1, false));

	}

	public static boolean pos(int a, int b, boolean negative) {
		if (((a < 0) || (b < 0))) {
			return true;
		} else if ((a < 0) && (b < 0) && (negative == true)) {
			return true;
		} else {
			return false;
		}
	}
}
