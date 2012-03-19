/* Task: Create a main( ) that uses varargs instead of the ordinary main( ) syntax. 
 * Print all the elements in the resulting args array. 
 * Test it with various numbers of command-line arguments.
 */

package chapter4initializationAndCleanup;

public class Exercise20 {

	public static void main(String[] args) {
		
		AnotherMain.main(new String[] { "first", "second", "third", "fourth",
		"fifth" });
		
		String [] str = {"bla", "bla-bla", "bla-bla-bla"};
		AnotherMain am = new AnotherMain();
		am.main(str);
	}

}
