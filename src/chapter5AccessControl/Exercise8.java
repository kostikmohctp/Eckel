/* Task: Following the form of the example Lunch.java, create a class 
 * called ConnectionManager that manages a fixed array of Connection objects. 
 * The client programmer must not be able to explicitly create Connection objects, 
 * but can only get them via a static method in ConnectionManager. 
 * When the ConnectionManager runs out of objects, it returns a null reference. 
 * Test the classes in main( ).
 * 
 class Soup1 {
private Soup1() {}
// (1) Allow creation via static method:
public static Soup1 makeSoup() {
return new Soup1();
}
}

class Soup2 {
private Soup2() {}
// (2) Create a static object and return a reference
// upon request.(The "Singleton" pattern):
private static Soup2 ps1 = new Soup2();
public static Soup2 access() {
return ps1;
}
public void f() {}
}
// Only one public class allowed per file:

public class Lunch {
void testPrivate() {
// Can’t do this! Private constructor:
//! Soup1 soup = new Soup1();
}
void testStatic() {
Soup1 soup = Soup1.makeSoup();
}
void testSingleton() {
Soup2.access().f();
}
}
 */

package chapter5AccessControl;

class ConnectionManager {
	private static int count = 0;
	private static Connection[] connArray = new Connection[10];

	private static void initialization() {
		for (int i = 0; i < 10; i++)
			// Creating Connection objects for the array
			connArray[i] = Connection.createConnection(i);
	}

	private ConnectionManager() { // default constructor with initialization of
									// connections
		initialization();
	}

	public static Connection access() {
		if (count < 10) {
			System.out.println("Accessing connection " + count);
			return connArray[count++];
		} else {
			System.out.println("No connection available!");
			return null;
		}
	}

};

class Connection {
	// private constructor. Not accessible from outer
	private Connection(int n) {
		System.out.println("Creating connection " + n);
	}

	// creating connection thru static method
	public static Connection createConnection(int i) {
		return new Connection(i);
	}
};

public class Exercise8 {

	public static void main(String[] args) {
		for (int n = 0; n < 12; n++) {
			ConnectionManager.access();
			Connection.createConnection(n);
		}
	}

}
