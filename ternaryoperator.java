package operators;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int b = sc.nextInt();
		System.out.print("Enter 3rd number: ");
		int c = sc.nextInt();
		int result = 0;
		result = a > b ? a > c ? a : c : b > c ? b : c;
		System.out.println(result +" is greater number.");

	}

}
