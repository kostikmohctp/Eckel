/* Task: Create a simple class. Inside a second class, 
 * define a reference to an object of the first class. 
 * Use lazy initialization to instantiate this object.
 * 
 */
//KT: I'm not sure in the correctness of solution
package chapter6ReusingClasses;

class Simple {
	String s01;

	public String toString() {
		return s01;
	};
}

public class Exercise1 {

	public static void main(String[] args) {
		Simple sim = new Simple();
		sim.s01 = "text";
		System.out.println(sim);
	}
}
