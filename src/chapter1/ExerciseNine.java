package chapter1;

public class ExerciseNine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean b = true;
		System.out.print("boolean: " + b + " ");
		Boolean bool = new Boolean(b);
		System.out.println(bool + ";");
		
		char c = 'c';
		System.out.print("character: " + c + " ");
		Character ch = new Character(c);
		System.out.println(ch + ";");
		
		byte bt = 127;
		System.out.print("byte: " + bt + " ");
		Byte byt = new Byte(bt);
		System.out.println(byt + ";");
		
		short s = 2345;
		System.out.print("short: " + s + " ");
		Short sh = new Short(s);
		System.out.println(sh + ";");
		
		int i = 1;
		System.out.print("integer: " + i + " ");
		Integer i01 = new Integer(i);
		System.out.println(i01 + ";");
		
		long l = 100500;
		System.out.print("long: " + l + " ");
		Long l01 = new Long(l);
		System.out.println(l01 + ";");
		
		float f = 11.5f;
		System.out.print("float: " + f + " ");
		Float fl = new Float(f);
		System.out.println(fl + ";");
				
		double d = 11.5;
		System.out.print("double: " + d + " ");
		Double doub = new Double(d);
		System.out.println(doub + ";");
				
	}

}
