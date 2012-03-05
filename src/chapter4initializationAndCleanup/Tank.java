/* Task: Create a class called Tank that can be filled and emptied, 
 * and has a termination condition that it must be empty when the object is cleaned up. 
 * Write a finalize( ) that verifies this termination condition. In main( ), 
 * test the possible scenarios that can occur when your Tank is used.
 */

package chapter4initializationAndCleanup;

public class Tank {

	private boolean isEmpty = false;

	protected void finalize() {
		System.out.println("your tank has been destroyed");
		System.gc();
	}

	void fill() {
		isEmpty = false;
		System.out.println("tank is full");
	}

	void empty() {
		isEmpty = true;
		System.out.println("tank is empty");
	}

	void checkTank() {
		if (isEmpty) {
			finalize();
		} else
			System.out.println("your tank available");
	}

	void printing() {
		System.out.println("ta daaam!");
	}

	public static void main(String[] args) {
		Tank someTank = new Tank();
		someTank.checkTank();
		someTank.fill();
		someTank.checkTank();
		someTank.empty();
		someTank.checkTank();
		System.gc();
		someTank.printing();
		System.gc();

	}

}
