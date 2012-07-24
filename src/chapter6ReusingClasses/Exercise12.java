//Exercise 12: Add a proper hierarchy of dispose( ) methods to all the classes in Exercise 9.

package chapter6ReusingClasses;

class Root02 {
	Root02() {
		System.out.println("Creating Root02");
		Component102 c102 = new Component102();
		Component202 c202 = new Component202();
		Component302 c302 = new Component302();

	}
	void dispose(){
		System.out.println("Terminating Root02");
	}
}

class Component102 {
	Component102() {
		System.out.println("Creating Component102");
	}

	void dispose() {
		System.out.println("Terminating Component102");
	}
}

class Component202 {
	Component202() {
		System.out.println("Creating Component202");
	}

	void dispose() {
		System.out.println("Terminating Component202");
	}
}

class Component302 {
	Component302() {
		System.out.println("Creating Component302");
	}

	void dispose() {
		System.out.println("Terminating Component302");
	}
}

class ExtendedRoot02 extends Root02 {
	private Component102 c102;
	private Component202 c202;
	private Component302 c302;
	ExtendedRoot02() {
		System.out.println("Creating ExtendedRoot");
		c102 = new Component102();
		c202 = new Component202();
		c302 = new Component302();
	}
	void dispose(){
		System.out.println("Terminating ExtendedRoot02");
		c302.dispose();
		c202.dispose();
		c102.dispose();
		super.dispose();
	}
}

public class Exercise12 {

	public static void main(String[] args) {
		ExtendedRoot02 exr02 = new ExtendedRoot02();
		exr02.dispose();

	}

}
