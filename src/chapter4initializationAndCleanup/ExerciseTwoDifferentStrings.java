/*Task: Create a class with a String field that is initialized at the point of definition, 
 * and another one that is initialized by the constructor. What is the difference between 
 * the two approaches? 
 * 
 * KT: Difference is: initializedString available all the time, 
 * 	initializedStringByTheConstructor available only after calling default constructor
 */

package chapter4initializationAndCleanup;

public class ExerciseTwoDifferentStrings {

	static String initializedString = "some text";

	ExerciseTwoDifferentStrings() {
		String initializedStringByTheConstructor = "another text";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
