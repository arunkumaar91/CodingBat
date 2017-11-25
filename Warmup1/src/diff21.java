/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class diff21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(diff(19));
		System.out.println(diff(10));
		System.out.println(diff(21));
	}

	public static int diff(int n) {
		int value = 21;
		if (n > value) {
			return (2 * (n - value));
		} else {
			return (Math.abs(n - value));
		}
	}
}