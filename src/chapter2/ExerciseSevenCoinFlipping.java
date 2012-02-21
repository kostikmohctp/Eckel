package chapter2;

import java.util.Random;

public class ExerciseSevenCoinFlipping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		int heads = rand.nextInt(100);
		int tails = rand.nextInt(100);
	
		System.out.println(heads);
		System.out.println(tails);
		if (heads > tails) System.out.println("Heads!");
			else 
			if (heads < tails) System.out.println("Tails!");
				else System.out.println("Ridge!");
		
		
		
	}

}
