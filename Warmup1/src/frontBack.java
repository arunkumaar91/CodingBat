/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class frontBack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(front("code"));
		System.out.println(front("a"));
		System.out.println(front("ab"));
		System.out.println(front("arun"));
	}

	public static String front(String str) {
		if (str.length() <= 1) {
			return str;
		} else {
			char firstChar = str.charAt(0);
			String middleChar = str.substring(1, str.length() - 1);
			char lastChar = str.charAt(str.length() - 1);
			String changedStr = Character.toString(lastChar) + middleChar + Character.toString(firstChar);
			return changedStr;
		}
	}
}