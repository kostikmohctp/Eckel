/* Task: Create an enum of the least-valuable six types of paper currency. 
 * Loop through the values( ) and print each value and its ordinal( ).
 */


package chapter4initializationAndCleanup;

public class Exercise21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (PaperCurrency pc : PaperCurrency.values()){
			System.out.println(pc + ", ordinal " + pc.ordinal());
		}

	}

}
