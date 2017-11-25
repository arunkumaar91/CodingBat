/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class intMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(1, 2, 3));
		System.out.println(max(1, 3, 2));
		System.out.println(max(3, 2, 1));
	}

	public static int max(int a, int b, int c) {
		if ((a > b) && (a > c)) {
			return a;
		} else if ((b > a) && (b > c)) {
			return b;
		} else {
			return c;
		}
	}
}
