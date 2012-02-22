//Task: Modify Exercise 2 so that your code is surrounded by an “infinite” while loop. It will then run until you interrupt it from the keyboard (typically by pressing Control-C).
//KT: I've decided to use method 'comparsion' from Ex2, without modifying
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
