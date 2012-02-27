package chapter3;

public class ExFiveIvan {

	public static void toBinary(int number) {
		  System.out.print(number + " = ");
		  do {
		   System.out.print(((number & 1) > 0) ? '1' : '0');
		   number >>= 1;
		  } while (number > 0);
		  System.out.println();
		 }
//можна ще простіше	
		 public static void toBinarySimple(int number) {
		  System.out.print(number + " = ");
		  do {
		   System.out.print(number & 1);
		   number >>= 1;
		  } while (number > 0);
		  System.out.println();
		 }
	public static void main(String[] args) {
		int number = 67;
		
		toBinary(number);
		toBinarySimple(number);

	}

}
