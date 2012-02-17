package chapter1;

public class ExerciseFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExerciseFourStorage storage = new ExerciseFourStorage();
		storage.b = true;
		storage.i = 42;
		storage.d = 100.500;

		System.out.println("boolean = " + storage.b);
		System.out.println("integer = " + storage.i);
		System.out.println("double = " + storage.d);

	}

}
