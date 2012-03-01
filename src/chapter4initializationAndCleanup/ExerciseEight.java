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
