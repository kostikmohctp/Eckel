/* Task:
 * Repeat Exercise 10 from the previous chapter, using the ternary operator and a 
 * bitwise test to display the ones and zeroes, instead of Integer.toBinaryString( ).
 * 
 * Exercise 10: (3) Write a program with two constant values, one with alternating 
 * binary ones and zeroes, with a zero in the least-significant digit, and the second, 
 * also alternating, with a one in the least-significant digit (hint: It’s easiest to 
 * use hexadecimal constants for this). Take these two values and combine them in all 
 * possible ways using the bitwise operators, and display the results using Integer.toBinaryString( ).
 */

package chapter3;

public class ExerciseFive {

	static int first = 66456;
	static int second = 66457;

	public static String intNumberToBinary(int binary) {
		String digit = "";
		boolean start = true;

		while (start) {
			digit = binary % 2 + digit;
			binary = binary / 2;

			if (binary == 0) {
				start = false;
			}
		}
		return digit;
	}

	public static void main(String[] args) {
		// return (boolean) ? (case1) : (elseCase2);

		System.out.println("first  decimal: " + first + " = binary: "
				+ Integer.toBinaryString(first));
		System.out.println("second decimal: " + second + " = binary: "
				+ Integer.toBinaryString(second));

		String firstInBinary = intNumberToBinary(first);
		String secondInBinary = intNumberToBinary(second);

		System.out.println(firstInBinary);
		System.out.println(secondInBinary);

	}

}
