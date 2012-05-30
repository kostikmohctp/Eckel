/* Task2: Inherit a new class from class Detergent. 
 * Override scrub( ) and add a new method called sterilize( ).
 * 
 */

package chapter6ReusingClasses;

public class Detergent extends Exercise2 {
	// Change a method:
	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub(); // Call base-class version
	}

	// Add methods to the interface:
	public void foam() {
		append(" foam()");
	}

	// Test the new class:
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Testing base class:");
		Exercise2.main(args);
	}
}