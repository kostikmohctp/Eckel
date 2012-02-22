package chapter2;

public class ExerciseTen {

	/**
	 * @param args
	 */
	static int first = 0x1a010;
	static int second = 0x1a011;

	public static void main(String[] args) {

		int result;

		System.out.println(first + " " + Integer.toBinaryString(first));
		System.out.println(second + " " + Integer.toBinaryString(second));

		result = first & second; // AND
		System.out.println(result + " " + Integer.toBinaryString(result));

		result = first | second; // OR
		System.out.println(result + " " + Integer.toBinaryString(result));

		result = first ^ second; // XOR
		System.out.println(result + " " + Integer.toBinaryString(result));

	}

}
