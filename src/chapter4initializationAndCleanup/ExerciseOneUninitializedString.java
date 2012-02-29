/*Task: Create a class containing an uninitialized String reference. 
 * Demonstrate that this reference is initialized by Java to null.
 */

package chapter4initializationAndCleanup;

public class ExerciseOneUninitializedString {
	
	static String uninitialized;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(uninitialized);
	}

}
