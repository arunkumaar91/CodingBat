/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class endUp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(end("Hello"));
		System.out.println(end("hi there"));
		System.out.println(end("hi"));
		System.out.println(end("arun"));

	}

	public static String end(String str) {
		if (str.length() > 3) {
			// System.out.println(str.length());
			String remaining = str.substring(0, str.length() - 3);
			// System.out.println(remaining);
			String lastThree = str.substring(str.length() - 3);
			// System.out.println(lastThree);
			return remaining + lastThree.toUpperCase();
		} else {
			String two = str.toUpperCase();
			return two;
		}
	}
}
