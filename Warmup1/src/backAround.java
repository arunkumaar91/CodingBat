/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class backAround {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(back("cat"));
		System.out.println(back("Hello"));
		System.out.println(back("a"));
		System.out.println(back(""));
	}

	public static String back(String str) {
		if (str.length() >= 1) {
			String last = Character.toString(str.charAt(str.length() - 1));
			return last + str + last;
		} else {
			return null;
		}
	}
}
