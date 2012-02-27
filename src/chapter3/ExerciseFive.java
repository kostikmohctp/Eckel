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
	static int second = 66456;

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

	public static String intNumberToBinaryTernary(int binary) {
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
	public static String comparsion (char [] firstArray, char [] secondArray ){
		int eofArray = firstArray.length;
		
		int counter = 0;
		
		for (int i=0; i < eofArray; i++){	
			if (firstArray[i] == secondArray[i]){
				counter++;
			}
			else break;			
		}
		
		String s = ((counter == eofArray) ? ("Numbers are equal") : ("Numbers are different"));
		return s;
		
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
		
		int firstLength = firstInBinary.length();
		int secondLength = secondInBinary.length();

		System.out.println(firstLength);
		System.out.println(secondLength);
		
		char[] firstArray = firstInBinary.toCharArray();
		for (int i=0; i < firstLength;
		i++){
			System.out.print(firstArray[i]);
		}
		System.out.println();
		
		
		char[] secondArray = secondInBinary.toCharArray();
		for (int i=0; i < secondLength;
		i++){
			System.out.print(secondArray[i]);
		}
		System.out.println();
		
		// return (boolean) ? (case1) : (elseCase2);
		String s = (firstLength == secondLength) ? (comparsion(firstArray,secondArray)) : ("Totally different");
		
		System.out.println(s);
	}

}
