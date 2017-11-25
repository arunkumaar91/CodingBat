/**
 * 
 */

/**
 * @author Arunkumaar
 *
 */
public class startOz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(start("ozymandias"));
		System.out.println(start("bzoo"));
		System.out.println(start("oxx"));
		System.out.println(start("A"));
		System.out.println(start("Arun"));
	}

	public static String start(String str) {
		if (str.length() >= 2) {
			String posOne = Character.toString(str.charAt(0));
			String posTwo = Character.toString(str.charAt(1));
			String result = "";
			if (posOne.equalsIgnoreCase("o") && (posTwo.equalsIgnoreCase("z"))) {
				return result + posOne + posTwo;
			} else if ((posOne.equalsIgnoreCase("o"))) {
				return result + posOne;
			} else if ((posTwo.equalsIgnoreCase("z"))) {
				return result + posTwo;
			} else {
				return str;
			}
		} else {
			return "Not able to process the string";
		}
	}
}