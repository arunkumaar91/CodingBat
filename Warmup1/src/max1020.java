/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class max1020 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(11, 19));
		System.out.println(max(19, 11));
		System.out.println(max(11, 20));
		System.out.println(max(11, 9));
		System.out.println(max(11, 11));
		System.out.println(max(55, 25));

	}

	public static int max(int a, int b) {
		if (((a >= 10 && a <= 20) && (b >= 10 && b <= 20))) {
			if (a > b) {
				return a;
			} else if (a == b) {
				return a;
			} else {
				return b;
			}
		} else if (((a >= 10 && a <= 20) || (b >= 10 && b <= 20))) {
			if (a > b) {
				return a;
			} else if (a == b) {
				return a;
			} else {
				return b;
			}
		} else {
			return 0;
		}
	}
}