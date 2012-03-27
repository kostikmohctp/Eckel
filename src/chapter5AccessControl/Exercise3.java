/* Task: Create two packages: debug (anotherPackage)and debugoff (anotherPackageToo), 
 * containing an identical class with a debug( ) method. 
 * The first version displays its String argument to the console, 
 * the second does nothing. Use a static import line to import the class into a test program, 
 * and demonstrate the conditional compilation effect.
 */

package chapter5AccessControl;


//import anotherPackage.Vector;
import anotherPackageToo.Vector;

public class Exercise3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector v = new Vector();
		v.debug("some string");

	}

}
