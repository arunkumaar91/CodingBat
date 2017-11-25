/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class nearHundred {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(near(93));
		System.out.println(near(90));
		System.out.println(near(89));
		System.out.println(near(290));
	}

	public static boolean near(int a) {
		if ((Math.abs(a) >= 90) && (Math.abs(a) <= 99) || (Math.abs(a) >= 190) && (Math.abs(a) <= 199)) {
			return true;
		} else {
			return false;
		}
	}
}