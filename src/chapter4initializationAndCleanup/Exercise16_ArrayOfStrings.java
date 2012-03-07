/* Task: Create an array of String objects and assign a String to each element. 
 * Print the array by using a for loop.
 */

package chapter4initializationAndCleanup;

public class Exercise16_ArrayOfStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] massiv = { "some", "text", "is", "here" };

		for (int i = 0; i < massiv.length; i++) {
			System.out.print(massiv[i]+ " ");
		}

	}

}
