/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class hasTeen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(teen(13, 20, 10));
		System.out.println(teen(20, 19, 10));
		System.out.println(teen(20, 10, 13));
		System.out.println(teen(25, 35, 45));
	}

	public static boolean teen(int a, int b, int c) {
		if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
			return true;
		} else {
			return false;
		}
	}
}
