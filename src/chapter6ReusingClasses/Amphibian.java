/* Exercise 16: (2) Create a class called Amphibian. 
 * From this, inherit a class called Frog. 
 * Put appropriate methods in the base class. 
 * In main( ), create a Frog and upcast it to Amphibian and demonstrate that all the methods still work.
 */

package chapter6ReusingClasses;

public class Amphibian {
	public void move() {
		System.out.println("move body");
	}

	public void stop() {
		System.out.println("stop body");
	}

	public void live() {
		System.out.println("live");
	}

	static void life(Amphibian amph) {
		amph.live();
	}

}
