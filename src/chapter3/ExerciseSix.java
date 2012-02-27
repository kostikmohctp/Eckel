/*Task: Modify the two test( ) methods in the previous two programs 
 * so that they take two extra arguments, begin and end, and so that 
 * testval is tested to see if it is within the range between 
 * (and including) begin and end.
 * 
/* control/IfElse.java
import static net.mindview.util.Print.*;
public class IfElse {
	static int result = 0;
	static void test(int testval, int target) {
	if(testval > target)
	result = +1;
	else if(testval < target)
	result = -1;
	else
	result = 0; // Match
	}
	public static void main(String[] args) {
	test(10, 5);
	print(result);
	test(5, 10);
	print(result);
	test(5, 5);
	print(result);
	}
	} /* Output:
	1
	-1
	0
 *///:~
/* control/IfElse2.java
import static net.mindview.util.Print.*;
public class IfElse2 {
static int test(int testval, int target) {
if(testval > target)
return +1;
else if(testval < target)
return -1;
else
return 0; // Match
}
public static void main(String[] args) {
print(test(10, 5));
print(test(5, 10));
print(test(5, 5));
}
} 
Output:
1
-1
0
 *///:~

package chapter3;

public class ExerciseSix {

	/**
	 * @param args
	 */
	static int test (int target, int begin, int end){
		if (target < begin)
			return -1;
		else if (target > end)
			return 100500;
		else if ((target > begin) && (target < end))
			return 10;
		else if (target == begin)
			return 1;
		else return 11;//if (target == end)
	}
	
	static int target = 9;
	static int startPoint = 5;
	static int endPoint = 20;
	
	public static void main(String[] args) {
		System.out.println("out of range and less than start point: -1");
		System.out.println("at the range and equal to start point: 1");
		System.out.println("at the range: 10");
		System.out.println("at the range and equal to end point: 11");
		System.out.println("out of range and bigger than end point: 100500");
		
		
//		test(target, startPoint, endPoint);
		System.out.println(test(5,1,20));
		System.out.println(test(1,1,20));
		System.out.println(test(20,1,20));
		System.out.println(test(-5,1,20));
		System.out.println(test(25,1,20));
		
		
	}

}
