/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class close10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(close(8, 13));
		System.out.println(close(13, 8));
		System.out.println(close(13, 7));
	}

	public static int close(int a, int b) {
		int diff1 = Math.abs(a - 10);
		int diff2 = Math.abs(b - 10);
		if (diff1 > diff2) {
			return b;
		} else if (diff1 == diff2) {
			return 0;
		} else {
			return a;
		}
	}
}