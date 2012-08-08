/* Exercise 14: (1) In Car.java add a service( ) method to Engine and call this method in main( ).
 * 
 */

package chapter6ReusingClasses;

class Engine {
	public void start() {
		System.out.println("engine started");
	}

	public void rev() {
		System.out.println("reverse mode");
	}

	public void stop() {
		System.out.println("engine stopped");
	}

	public void service() {
		System.out.println("service()");
	}
}

class Wheel {
	public void inflate(int psi) {
		System.out.println("preassure = " + psi);
	}
}

class Window {
	public void rollup() {
		System.out.println("rollup window");
	}

	public void rolldown() {
		System.out.println("rolldown window");
	}
}

class Door {
	public Window window = new Window();

	public void open() {
		System.out.println("door opened");
	}

	public void close() {
		System.out.println("door closed");
	}
}

public class Car {
	public Engine engine = new Engine();
	public Wheel[] wheel = new Wheel[4];
	public Door left = new Door(), right = new Door(); // 2-door

	public Car() {
		for (int i = 0; i < 4; i++)
			wheel[i] = new Wheel();
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.left.window.rollup();
		car.wheel[0].inflate(42);
		car.engine.service();
	}
}