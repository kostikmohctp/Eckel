package chapter5AccessControl;

public class Exercise5_setOfAccesses {

	public Exercise5_setOfAccesses(){};
	
	public void methodPublic(){
		System.out.println("public method");
	};
	
	void methodDefault(){
		System.out.println("default method");
	};
	
	protected void methodProtected(){
		System.out.println("protected method");
	};
	
	private void methodPrivate(){
		System.out.println("private method");
	};
	
}
