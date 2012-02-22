//Task: Write a program that generates 25 random int values. For each value, use an if-else statement to classify it as greater than, less than, or equal to a second randomly generated value.

package chapter3;

import java.util.Random;

public class ExerciseTwo {

	/**
	 * @param args
	 */
	static String comparsion(int previous, int current) {
		String s;
		if (previous < current) {
			s = "bigger than previous " + previous;
		} else if (previous > current) {
			s = "less than previous " + previous;
		} else
			s = "equal to previous " + previous;
		return s;
	}

	public static void main(String[] args) {
		int result = 0;
		Random rand = new Random();
		for (int i = 0; i < 25; i++) {
			int previous = result;
			result = rand.nextInt(20);
			System.out.println("Number " + result + " is "
					+ comparsion(previous, result));

		}
	}

}
