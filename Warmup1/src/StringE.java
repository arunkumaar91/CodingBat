/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class StringE {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringe("Hello"));
		System.out.println(stringe("Heelle"));
		System.out.println(stringe("Heelelee"));
		System.out.println(stringe("Light"));
	}

	public static boolean stringe(String str) {
		int total = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				total++;
			}
		}
		if (total >= 1 && total <= 3) {
			return true;
		} else {
			return false;
		}
	}
}
