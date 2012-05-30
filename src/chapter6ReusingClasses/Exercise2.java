/* Task2: Inherit a new class from class Detergent. 
 * Override scrub( ) and add a new method called sterilize( ).
 * 
 */

package chapter6ReusingClasses;

class Exercise2 {
	private String s = "Cleanser";

	public void append(String a) {
		s += a;
	}

	public void dilute() {
		append(" dilute()");
	}

	public void apply() {
		append(" apply()");
	}

	public void scrub() {
		append(" scrub()");
	}

	public String toString() {
		return s;
	}

	public static void main(String[] args) {
		Exercise2 x = new Exercise2();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
	}

}
