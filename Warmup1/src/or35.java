/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class or35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(or(3));
		System.out.println(or(9));
		System.out.println(or(10));
		System.out.println(or(8));
	}

	public static boolean or(int i) {
		if (i >= 0) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
