package chapter6ReusingClasses;

public class Frog extends Amphibian {

	public void stop(){
		System.out.println("frog jumps"); //I had to add 'public' modifier
	}
	
	public static void main(String[] args) {
		Frog froggy = new Frog();
		
		froggy.move();
		froggy.stop();
		Amphibian.life(froggy);
	}

}