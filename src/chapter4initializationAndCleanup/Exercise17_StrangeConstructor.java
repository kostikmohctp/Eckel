/* Task: Create a class with a constructor that takes a String argument. 
 * During construction, print the argument. 
 * Create an array of object references to this class, but 
 * don’t actually create objects to assign into the array. 
 * When you run the program, notice whether the initialization messages from 
 * the constructor calls are printed.
 */

package chapter4initializationAndCleanup;

public class Exercise17_StrangeConstructor {

	Exercise17_StrangeConstructor(String s) {
		System.out.print(s + " ");
	}

	public static void main(String[] args) {

		// Exercise17_StrangeConstructor[] someArray;

		Exercise17_StrangeConstructor[] someArray = {
				new Exercise17_StrangeConstructor("first"),
				new Exercise17_StrangeConstructor("second"),
				new Exercise17_StrangeConstructor("third") };

		// someArray = new Exercise17_StrangeConstructor[] {
		// new Exercise17_StrangeConstructor("first"),
		// new Exercise17_StrangeConstructor("second"),
		// new Exercise17_StrangeConstructor("third"), };

	}
}
