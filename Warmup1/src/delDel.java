/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class delDel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(del("adelbc"));
		System.out.println(del("adelHello"));
		System.out.println(del("adedbc"));
		System.out.println(del("add"));
	}

	public static String del(String str) {
		if ((str.length() >= 4) && (str.substring(1, 4).equals("del"))) {
			String newString = str.substring(0, 1);
			String newString1 = str.substring(4, str.length());
			return newString + newString1;
		} else {
			return str;
		}
	}
}