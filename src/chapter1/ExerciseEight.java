package chapter1;

public class ExerciseEight {

	public static void main(String[] args) {
		StaticInt i01 = new StaticInt();
		StaticInt i02 = new StaticInt();
		StaticInt i03 = new StaticInt();
		StaticInt i04 = new StaticInt();
		StaticInt i05 = new StaticInt();
		StaticInt i06 = new StaticInt();
		StaticInt i07 = new StaticInt();
		StaticInt i08 = new StaticInt();
		
		System.out.println("i01 = " + i01.i);
		System.out.println("i02 = " + i02.i);
		System.out.println("i03 = " + i03.i);
		System.out.println("i04 = " + i04.i);
		System.out.println("i05 = " + i05.i);
		System.out.println("i06 = " + i06.i);
		System.out.println("i07 = " + i07.i);
		System.out.println("i08 = " + i08.i);

		Incrementable.increment();
		
		System.out.println("i01 = " + i01.i);
		System.out.println("i02 = " + i02.i);
		System.out.println("i03 = " + i03.i);
		System.out.println("i04 = " + i04.i);
		System.out.println("i05 = " + i05.i);
		System.out.println("i06 = " + i06.i);
		System.out.println("i07 = " + i07.i);
		System.out.println("i08 = " + i08.i);
		
	}

}
