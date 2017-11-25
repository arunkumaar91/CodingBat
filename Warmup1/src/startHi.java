/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class startHi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(start("hi there"));
		System.out.println(start("hi"));
		System.out.println(start("hello hi"));
		System.out.println(start("hey"));
	}

	public static boolean start(String str) {
		if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
			return true;
		} else {
			return false;
		}
	}
}
