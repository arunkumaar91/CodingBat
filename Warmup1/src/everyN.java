/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class everyN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(every("Miracle", 2));
		System.out.println(every("abcdefg", 2));
		System.out.println(every("abcdefg", 3));
	}

	public static String every(String str, int n) {
		if (str != null && n > 1) {
			String newstr = "";
			for (int i = 0; i <= str.length() - 1; i = i + n) {
				newstr += str.charAt(i);
			}
			return newstr;
		} else {
			return "Enter valid string or number";
		}
	}
}
