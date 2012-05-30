/* Task2: Inherit a new class from class Detergent. 
 * Override scrub( ) and add a new method called sterilize( ).
 * 
 */

package chapter6ReusingClasses;

public class InheritDetergent extends Detergent {

	public void scrub() {
		append(" InheritDetergent.Detergent.scrub()");
		super.scrub(); // Call base-class version
	}

	public void sterilize() {
		append(" Sterilize()");
	};

	public static void main(String[] args) {
		InheritDetergent id = new InheritDetergent();
		id.scrub();
		id.sterilize();
		System.out.println(id.toString());

	}

}
