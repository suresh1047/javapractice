package loop;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to print a table: ");
		int tableOf = sc.nextInt();
		for(int i = 1; i <= 10; i++) {
			System.out.println(tableOf+ "x"+i+"="+tableOf*i);
		}
		
	}

}
