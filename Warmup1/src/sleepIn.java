/**
 * @author Arunkumaar
 *
 */
public class sleepIn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sleep(false, true));
	}

	public static boolean sleep(boolean weekday, boolean vacation) {
		if (!weekday || vacation) {
			return true;
		} else {
			return false;
		}
	}
}