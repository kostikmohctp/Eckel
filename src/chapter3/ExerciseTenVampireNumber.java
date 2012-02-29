/*A vampire number has an even number of digits and is formed by 
 * multiplying a pair of numbers containing half the number of digits of the result. 
 * The digits are taken from the original number in any order. 
 * Pairs of trailing zeroes are not allowed. Examples include:
1260 = 21 * 60
1827 = 21 * 87
2187 = 27 * 81
Write a program that finds all the 4-digit vampire numbers.
 * 
 */

package chapter3;

public class ExerciseTenVampireNumber {

	/**
	 * @param args
	 */
	static void creation(int first, int second) {
		int result = first * second;
		String firstNum = "" + first;
		String secondNum = "" + second;
		String resultNum = "" + result;

		char[] resultArray = resultNum.toCharArray();
		char[] plusArray = (firstNum + secondNum).toCharArray();
		
		int count = 0;
		
		for (int i = 0; i < resultArray.length; i++) {
			for (int j = 0; j < plusArray.length; j++) {
				if (resultArray[i] == plusArray[j]) {
					count++;
					resultArray[i] = 'a';
					plusArray[j] = 'b';
				}
			}
		}
		if (count == 4)
			System.out.println("Vampire number: " + firstNum + " " + secondNum + " " + resultNum);
		//else System.out.println("non vampire number: " + firstNum + " " + secondNum + " " + resultNum);

	}

	public static void main(String[] args) {
		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 100; j++) {
				creation(i,j);
			}
		}

	}

}
