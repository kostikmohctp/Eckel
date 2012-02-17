package chapter1;

public class ExerciseSix {

	static int storage (String s){
		return s.length()*2;
	}
	
	public static void main(String[] args) {
	
		String s = "text=text";
		
		System.out.println("bytes of string text = " + ExerciseSix.storage(s));
	}

}
