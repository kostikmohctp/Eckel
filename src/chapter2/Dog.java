package chapter2;

/**
 * aka ExerciseFive plus ExerciseSix
 * 
 * @author Konstantin_Tseruliev
 * @version 1.0
 */
public class Dog {

	String name, says;

	public static void main(String[] args) {

		Dog dogOne = new Dog();
		Dog dogTwo = new Dog();

		dogOne.name = "spot";
		dogOne.says = "Ruff!";
		dogTwo.name = "scruffy";
		dogTwo.says = "Wurf!";

		System.out.println("First dog name: " + dogOne.name + ", it says "
				+ dogOne.says);
		System.out.println("Second dog name: " + dogTwo.name + ", it says "
				+ dogTwo.says);

		Dog dogThree = new Dog();;
		dogThree = dogOne;
		
		System.out.println("dogThree.equals(dogOne): " + dogThree.equals(dogOne));
		
		System.out.println("dogThree.name == dogOne.name: "
				+ (dogThree.name == dogOne.name));
		System.out.println("dogThree.name.equals(dogOne.name): "
				+ dogThree.name.equals(dogOne.name));

		System.out.println("dogThree.says == dogOne.says: "
				+ (dogThree.says == dogOne.says));
		System.out.println("dogThree.says.equals(dogOne.says): "
				+ dogThree.says.equals(dogOne.says));
	}

}
