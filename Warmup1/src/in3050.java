/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class in3050 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(in(30, 31));
		System.out.println(in(30, 41));
		System.out.println(in(40, 50));
		System.out.println(in(50, 60));
	}

	public static boolean in(int a, int b) {
		if (((a >= 30 && a <= 40) && (b >= 30 && b <= 40))) {
			return true;
		} else if (((a >= 40 && a <= 50) && (b >= 40 && b <= 50))) {
			return true;
		} else {
			return false;
		}
	}

}
