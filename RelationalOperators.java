package operators;
import java.util.Scanner;
public class RelationalOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a, b;
		System.out.println("Enter 1st number: ");
		a = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		b = sc.nextInt();
		System.out.println("a is " + a + " and b is " + b);

	    // is equal to operator
	    System.out.println(a == b);

	    // not equal to operator
	    System.out.println(a != b);

	    // greater than operator
	    System.out.println(a > b);

	    // less than operator
	    System.out.println(a < b);

	    // greater than or equal to operator
	    System.out.println(a >= b);
	    
	    // less then or equal to operator
	    System.out.println(a <= b);
	}

}
