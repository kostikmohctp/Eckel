/* Exercise 15: Create a class inside a package (Ex15Protected - classname). 
 * Your class should contain a protected method. 
 * Outside of the package, try to call the protected method and explain the results. 
 * Now inherit from your class and call the protected method from inside a method of your derived class.
 */


package chapter6ReusingClasses;

public class Exercise15 extends Ex15Protected{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Exercise15 ex15 = new Exercise15();
		ex15.protectedmethod();

	}

}
