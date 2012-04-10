/* Task: Show that protected methods have package access but are not public.
 */


package chapter5AccessControl;

import anotherPackage.Exercise4_AnotherPackage;


public class Exercise4_UsingProtected {

	public static void main(String[] args) {
		Exercise4 ex0401 = new Exercise4();
		ex0401.protMethod();
		
		Exercise4_AnotherPackage ex0402 = new Exercise4_AnotherPackage(){};
		//ex0402.protMethod(); //ask to change visibility of method to public
	}
	
}
