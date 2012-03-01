/* Task: Create a class with two methods. Within the first method, 
 * call the second method twice: the first time without using this, 
 * and the second time using this—just to see it working; 
 * you should not use this form in practice.
 */


package chapter4initializationAndCleanup;

public class ExerciseEight {

	void mainMethod() {
		someMethod();
		this.someMethod();
	}

	void someMethod() {
		
		System.out.println("someMethod ");
	}

	public static void main(String[] args) {
		
		ExerciseEight instanceOfClass = new ExerciseEight();
		
		instanceOfClass.mainMethod(); //here we call method, which calls another method twice
		instanceOfClass.someMethod();
	}

}
