/* Task: Create a class with protected data. 
 * Create a second class in the same file with a method that 
 * manipulates the protected data in the first class.
 */

package chapter5AccessControl;

class Exercise6Inside {
	protected int digit = 12;
};

public class Exercise6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Exercise6Inside ex06in = new Exercise6Inside();
		ex06in.digit = 100500;
		System.out.println(ex06in.digit);

		Exercise6Inside ex0601in = new Exercise6Inside();
		System.out.println(ex0601in.digit);
	}

}
