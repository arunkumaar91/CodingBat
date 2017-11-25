/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class lastDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(last(7, 17));
		System.out.println(last(6, 17));
		System.out.println(last(3, 113));
	}

	public static boolean last(int a, int b) {
		if (a % 10 == b % 10) {
			return true;
		} else {
			return false;
		}
	}

}
