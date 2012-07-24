/* Task9: Create a class called Root that contains an instance of each of the classes 
 * (that you also create) named Component1, Component2, and Component3. 
 * Derive a class Stem from Root that also contains an instance of each “component.” 
 * All classes should have default constructors that print a message about that class.
 * 
 */

package chapter6ReusingClasses;

class Root {
	Root() {
		System.out.println("Root");
		Component1 c1 = new Component1();
		Component2 c2 = new Component2();
		Component3 c3 = new Component3();

	}

}

class Component1 {
	Component1() {
		System.out.println("Component1");
	}
}

class Component2 {
	Component2() {
		System.out.println("Component2");
	}
}

class Component3 {
	Component3() {
		System.out.println("Component3");
	}
}

class ExtendedRoot extends Root {
	ExtendedRoot() {
		System.out.println("ExtendedRoot");
		Component1 c1 = new Component1();
		Component2 c2 = new Component2();
		Component3 c3 = new Component3();
	}
}

public class Exercise9 {

	public static void main(String[] args) {
		ExtendedRoot exr = new ExtendedRoot();

	}

}
/* Output:
 * Root
 * Component1
 * Component2
 * Component3
 * ExtendedRoot
 * Component1
 * Component2
 * Component3
 */

