/* Task: Create a class with public, private, protected, and package-access fields and method members. 
 * Create an object of this class and see what kind of compiler messages you get 
 * when you try to access all the class members. Be aware that classes 
 * in the same directory are part of the “default” package.
 */


package chapter5AccessControl;

public class Exercise5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Exercise5_setOfAccesses ex05 = new Exercise5_setOfAccesses(){};
		ex05.methodDefault();
		ex05.methodProtected();
		ex05.methodPublic();
		//ex05.methodPrivate(); //ask to change visibility

	}

}
