/* Task 5: Create a class called Dog with an overloaded bark( ) method. 
 * This method should be overloaded based on various primitive data types, 
 * and print different types of barking, howling, etc., depending on which 
 * overloaded version is called. Write a main( ) that calls all the different versions.
 * 
 * Task 6: Modify the previous exercise so that two of the overloaded methods have 
 * two arguments (of two different types), but in reversed order relative to each other. 
 * Verify that this works.
 */

package chapter4initializationAndCleanup;

public class Dog {

	static void bark(int i) {
		System.out.println("int");
	}

	static void bark(byte b) {
		System.out.println("byte");
	}

	static void bark(char c) {
		System.out.println("char");
	}

	static void bark(long l) {
		System.out.println("long");
	}

	static void bark(float f) {
		System.out.println("float");
	}

	static void bark(double d) {
		System.out.println("double");
	}

	void bark(short s) {
		System.out.println("short");
	}

	static void bark(double d, char c) {
		System.out.println("double and char");
	}

	static void bark(char c, double d) {
		System.out.println("char and double");
	}
	static byte b = 5;
	
	public static void main(String[] args) {
		bark(128);
		bark('c');
		bark(b); 
		bark(128L);
		bark(128f);
		bark(128d);
		bark(128d, 'c');
		bark('c', 128d);

	}

}
