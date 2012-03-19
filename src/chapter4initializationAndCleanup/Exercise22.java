/* Task: Write a switch statement for the enum in the previous example. 
 * For each case, output a description of that particular currency.
 */

package chapter4initializationAndCleanup;

public class Exercise22 {

	static PaperCurrency pc;

	public static void switcher(PaperCurrency pc) {

		switch (pc) {
		case ONE:
			System.out.println("one uah");
			break;
		case TWO:
			System.out.println("two uah");
			break;
		case FIVE:
			System.out.println("five uah");
			break;
		case TEN:
			System.out.println("ten uah");
			break;
		case TWENTY:
			System.out.println("twenty uah");
			break;
		case FIFTY:
			System.out.println("fifty uah");
			break;
		default:
			System.out.println("zero uah");
		}

	}

	public static void main(String[] args) {
		for (PaperCurrency pc : PaperCurrency.values()) {
			switcher(pc);
		}

	}

}
