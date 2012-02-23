/*Task: Write a program that uses two nested for loops and the modulus operator (%) 
 * to detect and print prime numbers (integral numbers that are not evenly divisible,
 * by any other numbers except for themselves and 1).
 */
//Optimized three times ;)
package chapter3;

public class ExerciseFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			boolean t = true;
			for (int j = 2; j < i; j++) {
				int rest = i % j;
				if (rest == 0) {
					t = false;
					break;
				}
			}
			if (t) {
				System.out.println(i);
			}
		}

	}

}
