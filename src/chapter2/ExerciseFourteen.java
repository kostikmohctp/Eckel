package chapter2;

public class ExerciseFourteen {
	// arguments should be placed at the Run properties (Eclipse):
	// Run->Run Configurations...->Arguments tab->write two text tags

	/**
	 * @param args
	 */
	static void comparsion(String first, String second) {

		System.out.println("Arguments are the same? - " + (first == second));
		System.out.println("Arguments are different? (for dummies. K.O.) - " + (first != second));
		System.out.println("Lengths of arguments are the same? - "
				+ (first.length() == second.length()));
		System.out.println("Does the arguments are equal? - "
				+ first.equals(second));
	}

	public static void main(String[] args) {

		String firstArg = args[0];
		String secondArg = args[1];

		System.out.println("first argument: " + firstArg);
		System.out.println("second argument: " + secondArg);

		comparsion(firstArg, secondArg);

	}

}
