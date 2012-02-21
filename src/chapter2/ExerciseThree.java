package chapter2;
/**
 * Aliasing in action. Part two
 * 
 * @author Konstantin_Tseruliev
 * @version 1.0
 */
public class ExerciseThree {

	/**
	 * @param args
	 */
	static void verySeriousMethod(ExerciseTwoFloatContainer someVariable) {
		someVariable.number = 42.42f;
	}

	public static void main(String[] args) {
		ExerciseTwoFloatContainer firstVariable = new ExerciseTwoFloatContainer();
		firstVariable.number = 100500f;
		System.out.println("1: firstVariable.number: " + firstVariable.number);

		verySeriousMethod(firstVariable);
		System.out.println("2: firstVariable.number (after running verySeriousMethod): " + firstVariable.number);
	}
}
