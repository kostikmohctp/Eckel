/* Task: Create a class with a finalize( ) method that prints a message. 
 * In main( ), create an object of your class. Explain the behavior of your program.
 */


package chapter4initializationAndCleanup;

public class Exercise10_FinalizeMethod {

	public void finalize(){
		System.out.println("Message");
	}

/**
	 * @param args
	 */
	public static void main(String[] args) {
		Exercise10_FinalizeMethod newInstance = new Exercise10_FinalizeMethod();
		newInstance.finalize();
		
		new Exercise10_FinalizeMethod();
		System.gc();
// Actually I can't explain, why "Message" prints twice :(		
	}

}
