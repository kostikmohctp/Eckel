/* Task 11: Modify Detergent.java so that it uses delegation. (Exercise2)
 */

package chapter6ReusingClasses;

class Detergent2 extends Exercise2 {
	public void foam() {
		append(" foam()");
	}

	Exercise2 ex2 = new Exercise2();

	// Delegated methods block
	public void append(String a) {
		ex2.append(a);
	}

	public void dilute() {
		ex2.dilute();
	}

	public void apply() {
		ex2.apply();
	}

	public void scrub() {
		append(" Detergent2.scrub()");
		ex2.scrub();
	}

	public String toString() {
		return ex2.toString();
	}
	// End of delegated methods block
}

public class Exercise11 {
	public static void main(String[] args) {
		Detergent2 x = new Detergent2();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
	}
}
/*
 * Output: Cleanser dilute() apply() Detergent2.scrub() scrub() foam()
 */