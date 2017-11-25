/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class sumDouble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sdouble(1, 2));
		System.out.println(sdouble(3, 2));
		System.out.println(sdouble(2, 2));
	}

	public static int sdouble(int a, int b) {
		if (a == b) {
			return (2 * (a + b));
		} else {
			return a + b;
		}
	}
}