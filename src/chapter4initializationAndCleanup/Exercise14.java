/* Task: Create a class with a static String field that is initialized at the point
 *  of definition, and another one that is initialized by the static block. 
 *  Add a static method that prints both fields and demonstrates that they are both 
 *  initialized before they are used.
 */

package chapter4initializationAndCleanup;

public class Exercise14 {

	static String s001 = "string 001";

	static String s002;
	static {
		s002 = "static string 002";
	}

	public Exercise14() {

	}

	static void printing() {
		System.out.println(s001);
		System.out.println(s002);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printing();

	}

}
