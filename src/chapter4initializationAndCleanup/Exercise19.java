/* Task: Write a method that takes a vararg String array. 
 * Verify that you can pass either a comma-separated 
 * list of Strings or a String[] into this method.
 */

package chapter4initializationAndCleanup;

public class Exercise19 {
	static void printArray(String... aLotOfStrings) {
		for (String s : aLotOfStrings) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printArray("Some", "string", "text", "is", "here");
		printArray(new String[] { "Another", "string", "text", "is", "here" });
	}
}
