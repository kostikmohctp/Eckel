package chapter3;

import java.util.Random;

public class ExerciseThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int result = 0;
		Random rand = new Random();
		while (true) {
			int previous = result;
			result = rand.nextInt(20);
			System.out.println("Number " + result + " is "
					+ ExerciseTwo.comparsion(previous, result));

		}
	}

}
