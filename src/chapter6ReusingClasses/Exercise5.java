/* Task5: Create two classes, A and B, with default constructors (empty argument lists) 
 * that announce themselves. Inherit a new class called C from A, 
 * and create a member of class B inside C. Do not create a constructor for C. 
 * Create an object of class C and observe the results.
 * 
 */

package chapter6ReusingClasses;

class A{
	A(){
		System.out.println("A");
	};
}

class B{
	B(){
		System.out.println("B");
	};
}

class C extends A{
	
		B b = new B();
	
}

public class Exercise5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		C c = new C();

	}

}
/* Output:
 * A
 * B 
 */
