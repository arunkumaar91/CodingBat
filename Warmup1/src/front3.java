/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class front3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(frontThree("Java"));
		System.out.println(frontThree("Chocolate"));
		System.out.println(frontThree("abc"));
	}

	public static String frontThree(String str) {
		if (str.length() <= 3) {
			return (str + str + str);
		} else {
			String front3 = str.substring(0, 3);
			return (front3 + front3 + front3);
		}
	}
}
