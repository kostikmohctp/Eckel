package chapter2;

public class ExerciseTwelve {

	/**
	 * @param args
	 */
	static int number = 0xffff;

	public static void main(String[] args) {

		System.out.println("number: " + Integer.toBinaryString(number) + " : "
				+ number);
		number <<= 1;
		System.out.println("number: " + Integer.toBinaryString(number) + " : "
				+ number);

		for (int i = 0; i < 17; i++) {
			number >>>= 1;
			System.out.println("number: " + Integer.toBinaryString(number) + " : "
					+ number);
		}
	}

}
