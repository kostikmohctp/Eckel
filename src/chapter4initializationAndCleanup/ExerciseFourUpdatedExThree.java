/*Task: Add an overloaded constructor to the previous exercise that 
 * takes a String argument and prints it along with your message.
 */


package chapter4initializationAndCleanup;

public class ExerciseFourUpdatedExThree {

	ExerciseFourUpdatedExThree(){
		System.out.println("ExerciseFourUpdatedExThree...");
	}
	
	ExerciseFourUpdatedExThree(String s){
		System.out.println("ExerciseFourUpdatedExThree + " + s);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExerciseFourUpdatedExThree exFour = new ExerciseFourUpdatedExThree();
		ExerciseFourUpdatedExThree exFour02 = new ExerciseFourUpdatedExThree("some text");
	}

}
