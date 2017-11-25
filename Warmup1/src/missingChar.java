/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class missingChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(missing("kitten", 1));
		System.out.println(missing("kitten", 0));
		System.out.println(missing("kitten", 4));
	}

	public static String missing(String str, int n) {
		String beforeN = str.substring(0, n);
		String afterN = str.substring(n + 1, str.length());
		return beforeN + afterN;
	}
}
