/* Task10: Modify the previous exercise so that each class only has non-default constructors.
 * 
 */

package chapter6ReusingClasses;

class Root01 {
	Root01(int i) {
		System.out.println("Root01");
		Component01 c1 = new Component01(i);
		Component02 c2 = new Component02(i);
		Component03 c3 = new Component03(i);

	}

}

class Component01 {
	Component01(int i) {
		System.out.println("Component01 "+ i);
	}
}

class Component02 {
	Component02(int i) {
		System.out.println("Component02 " + i);
	}
}

class Component03 {
	Component03(int i) {
		System.out.println("Component03 " + i);
	}
}

class ExtendedRoot01 extends Root {
	ExtendedRoot01(int i) {
		System.out.println("ExtendedRoot01 " + i);
		Component01 c1 = new Component01(i);
		Component02 c2 = new Component02(i);
		Component03 c3 = new Component03(i);
	}
}

public class Exercise10 {

	public static void main(String[] args) {
		ExtendedRoot01 exr = new ExtendedRoot01(42);

	}

}