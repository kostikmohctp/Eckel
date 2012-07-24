/* Task7: Modify Exercise 5 so that A and B have constructors with arguments 
 * instead of default constructors. Write a constructor for C and perform all 
 * initialization within C’s constructor.
 */

package chapter6ReusingClasses;

class Aa {
	Aa(int i) {
		System.out.println("Aa " + i);
	};
}

class Bb {
	Bb(int i) {
		System.out.println("Bb " + i);
	};
}

class Cc extends Aa {

	Cc(int i) {
		super(i);
		Bb bb = new Bb(i);
	}
}

public class Exercise7 {

	public static void main(String[] args) {
		Cc cc = new Cc(42);

	}

}
/*
 * Output: 
 * Aa 42 
 * Bb 42
 */