/* Task: A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on,
 *  where each number (from the third on) is the sum of the previous two. 
 *  Create a method that takes an integer as an argument and displays that 
 *  many Fibonacci numbers starting from the beginning, e.g., If you run java Fibonacci 5 
 *  (where Fibonacci is the name of the class) the output will be: 1, 1, 2, 3, 5.
 * 
 */

package chapter3;

public class ExerciseNineFibonacci {

	/**
	 * @param args
	 */
	static int numberCount = 15;

	static int[] fibonacci(int numberCount) {
		int[] grid = new int[numberCount];
		grid[0] = 1;
		grid[1] = 1;
		for (int i = 2; i < numberCount; i++) {
			grid[i] = grid[i - 1] + grid[i - 2];
		}
		return grid;
	}

	public static void main(String[] args) {
		
		int[] grid = fibonacci(numberCount);
		
		for (int i=0; i<numberCount; i++){	
		System.out.print(grid[i] + " ");}
		
	}

}
