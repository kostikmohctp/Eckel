/* Task: Modify Exercise 1 so that the program exits by using 
 * the break keyword at value 99. Try using return instead.
 */


package chapter3;

public class ExerciseSeven {

	/**
	 * @param args
	 * @return 
	 */

	public static void main(String[] args) {
		for (int i = 1; i < 1010; i++){
			System.out.println(i);
			if (i == 99)
				break;
		}
	}

}
