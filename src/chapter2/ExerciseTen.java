package chapter2;

public class ExerciseTen {

	/**
	 * @param args
	 */
	static int first = 0x1010;
	static int second = 0x1011;

	public static void logicalAnd(int firstVar, int secondVar) {
		System.out.println("logical AND (first & second):");
		System.out.print("decimal: " + (firstVar & secondVar) + " = binary: "
				+ Integer.toBinaryString(firstVar & secondVar));
		System.out
				.println(" : if both input bits==1, then output bit=1, else bit=0");
	}

	public static void logicalOR(int firstVar, int secondVar) {
		System.out.println("logical OR (first | second):");
		System.out.print("decimal: " + (firstVar | secondVar) + " = binary: "
				+ Integer.toBinaryString(firstVar | secondVar));
		System.out
				.println(" : if one of input bits==1, then output bit=1, else bit=0");
	}

	public static void logicalXOR(int firstVar, int secondVar) {
		System.out.println("logical XOR (first ^ second):");
		System.out.print("decimal: " + (firstVar ^ secondVar) + " = binary: "
				+ Integer.toBinaryString(firstVar ^ secondVar));
		System.out
				.println(" : if only one of input bits==1, then output bit=1, else bit=0");
	}

	public static void main(String[] args) {

		System.out.println("first  decimal: " + first + " = binary: "
				+ Integer.toBinaryString(first));
		System.out.println("second decimal: " + second + " = binary: "
				+ Integer.toBinaryString(second));

		logicalAnd(first, second);
		logicalOR(first, second);
		logicalXOR(first, second);

	}

}
