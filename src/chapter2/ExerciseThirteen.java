package chapter2;

public class ExerciseThirteen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (char c = 48; c < 128; c++)
			System.out.println("value: " + (int)c + " character: " + c
					+ " binary: " + Integer.toBinaryString(c));
	}

}
