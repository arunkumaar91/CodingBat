/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class mixStart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mix("mix snacks"));
		System.out.println(mix("pix snacks"));
		System.out.println(mix("piz snacks"));
		System.out.println(mix("9ix"));
	}

	public static boolean mix(String str) {
		if (str.length() != 0) {
			if (str.substring(1, 3).equals("ix")) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
