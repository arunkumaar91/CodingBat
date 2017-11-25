/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class loneTeen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lone(13, 99));
		System.out.println(lone(21, 19));
		System.out.println(lone(13, 13));
		System.out.println(lone(25, 35));
	}

	public static boolean lone(int a, int b) {
		if ((a >= 13 && a <= 19) && (b >= 13 && b <= 19)) {
			return false;
		} else if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
			return true;
		} else {
			return false;
		}
	}
}