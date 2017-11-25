/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class notString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(not("candy"));
		System.out.println(not("y"));
		System.out.println(not("not bad"));
		System.out.println(not("not ok"));
		System.out.println(not("fine"));

	}

	public static String not(String str) {
		if (str.length() > 3 && str.substring(0, 3).equals("not")) {
			return str;
		} else {
			return "not" + " " + str;
		}
	}
}