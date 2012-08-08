/* Exercise 13: Create a class with a method that is overloaded three times. 
 * Inherit a new class, add a new overloading of the method, and show that 
 * all four methods are available in the derived class
 */


package chapter6ReusingClasses;

class Overloaded{
	int method (int i){
		System.out.println("i: " + i);
		return i;
	}
	
	char method (char c){
		System.out.println("c: " + c);
		return c;
	}
	
	float method (float f){
		System.out.println("f: " + f);
		return f;
	}
};


public class Exercise13 extends Overloaded {

	double method(double d){
		System.out.println("d: " + d);
		return d;
	}
	
	public static void main(String[] args) {
		Exercise13 ex13 = new Exercise13();
		int i = 42;
		char c = 'D';
		float f = 123f;
		double d = 100500;
		
		ex13.method(i);
		ex13.method(c);
		ex13.method(f);
		ex13.method(d);
		

	}

}
