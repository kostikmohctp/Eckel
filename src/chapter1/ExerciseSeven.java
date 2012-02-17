package chapter1;

public class ExerciseSeven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StaticInt i01 = new StaticInt();
		StaticInt i02 = new StaticInt();
		System.out.println(i01.i);
		System.out.println(i02.i);
		
		Incrementable inc01 = new Incrementable();
		inc01.increment();
		System.out.println(i01.i);
		System.out.println(i02.i);
	}

}
