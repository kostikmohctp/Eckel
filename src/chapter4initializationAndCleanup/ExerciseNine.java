/* Task: Create a class with two (overloaded) constructors. 
 * Using this, call the second constructor inside the first one.
 */

package chapter4initializationAndCleanup;

public class ExerciseNine {

	static double d;

	ExerciseNine(char c) {
		this(d);
		System.out.println("some text");
	}

	ExerciseNine(double d) {
		System.out.println("some text2");
	}

	public static void main(String[] args) {

		ExerciseNine nine = new ExerciseNine('c');

	}

}
