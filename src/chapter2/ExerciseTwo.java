package chapter2;

/**
 * Aliasing in action. Part one
 * 
 * @author Konstantin_Tseruliev
 * @version 1.0
 */
public class ExerciseTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ExerciseTwoFloatContainer exTwoFirst = new ExerciseTwoFloatContainer();
		ExerciseTwoFloatContainer exTwoSecond = new ExerciseTwoFloatContainer();

		exTwoFirst.number = 42.5f;
		exTwoSecond.number = 402.015f;
		System.out.println("1: exTwoFirst.number: " + exTwoFirst.number
				+ ", exTwoSecond.number: " + exTwoSecond.number);

		// try to comment next three lines and look what happen :)
		exTwoFirst = exTwoSecond;
		System.out.println("2: exTwoFirst.number: " + exTwoFirst.number
				+ ", exTwoSecond.number: " + exTwoSecond.number);

		exTwoFirst.number = 0.01f;
		System.out.println("3: exTwoFirst.number: " + exTwoFirst.number
				+ ", exTwoSecond.number: " + exTwoSecond.number);

		exTwoFirst.number = exTwoSecond.number;
		exTwoSecond.number = 777.777f;
		System.out.println("4: exTwoFirst.number: " + exTwoFirst.number
				+ ", exTwoSecond.number: " + exTwoSecond.number);
	}

}
