/* Task4: Prove that the base-class constructors are 
 * (a) always called and 
 * (b) called before derived-class constructors.
 * 
 */

package chapter6ReusingClasses;

class Parent {
	Parent() {
		System.out.println("Parent constructor");
	};
};

class Child extends Parent {
	Child() {
		System.out.println("Child constructor");
	};
};

class ChildChild extends Child {
	ChildChild() {
		System.out.println("ChildChild constructor");
		Parent p = new Parent();
	};
};

public class Exercise4 {

	public static void main(String[] args) {
		ChildChild chch = new ChildChild();

	}

}
