/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class in1020 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(in(12, 99));
		System.out.println(in(21, 12));
		System.out.println(in(8, 99));
		System.out.println(in(10, 20));
	}

	public static boolean in(int x, int y) {
		if ((x >= 10 && x <= 20) || (y >= 10 && y <= 20)) {
			return true;
		} else {
			return false;
		}
	}
}
