package operators;
import java.util.Scanner;
public class ArithmeticOperators {

	public static void main(String[] args) {
		//Create scanner class object
		Scanner sc = new Scanner (System.in);
		
		//Input two numbers from user
		System.out.print("Enter 1st number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int num2 = sc.nextInt();
		
		//Perform arithmetic operations
		int add = num1 + num2;
		int subt = num1 - num2;
		int mul = num1 * num2;
		float div = (float)num1 / num2;
		float mod = (float)num1 % num2;
		// Print result
		System.out.println("Addition of both number is: "+add);
		System.out.println("Subtraction of both number is: "+subt);
		System.out.println("Multiplication of both number is: "+mul);
		System.out.println("Division of both number is: "+div);
		System.out.println("Modulo of both number is: "+mod);
	}

}
