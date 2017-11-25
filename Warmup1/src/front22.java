/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class front22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(front("kitten"));
		System.out.println(front("Ha"));
		System.out.println(front("abc"));
		System.out.println(front("arun"));
	}

	public static String front(String str) {
		if (str.length() <= 2) {
			return str + str + str;
		} else {
			String firstTwo = str.substring(0, 2);
			String returnString = firstTwo + str + firstTwo;
			return returnString;
		}
	}
}
