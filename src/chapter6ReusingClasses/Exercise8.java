/* Task8: Create a base class with only a non-default constructor, 
 * and a derived class with both a default (no-arg) and non-default constructor. 
 * In the derived-class constructors, call the base-class constructor.
 */

package chapter6ReusingClasses;

class NonDefault {
	NonDefault(int i) {
		System.out.println("NonDefault " + i);
	}
}

class Both extends NonDefault {

	Both() {
		super(42);
		System.out.println("Both: default");
	};

	Both(int i) {
		super(i);
		System.out.println("Both: non-default " + i);
	}

}

public class Exercise8 {

	public static void main(String[] args) {
		Both bothDefault = new Both();
		Both bothNonDef = new Both(45);

	}

}
/* Output:
 * NonDefault 42
 * Both: default
 * NonDefault 45
 * Both: non-default 45
 */
