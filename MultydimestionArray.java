package arrays;

import java.util.Scanner;

public class MultydimestionArray {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the row of multydimestion array: ");
	int r = sc.nextInt();
	System.out.println("Enter the column of multydimestion array: ");
	int c = sc.nextInt();
	int arr1[][] = new int [r][c];
	int arr2[][] = new int [r][c];
	System.out.println("Enter multydimestion array 1st: ");
	for(int i = 0; i < r; i++) {
		for(int j = 0; j < c; j++) {
			arr1[i][j] = sc.nextInt();
		}
	}
	System.out.println("Enter multydimestion array 2st: ");
	for(int i = 0; i < r; i++) {
		for(int j = 0; j < c; j++) {
			arr2[i][j] = sc.nextInt();
		}
	}
	int arrsum[][] = new int [r][c];
	for(int i = 0; i < r; i++) {
		for(int j = 0; j < c; j++) {
			arrsum[i][j] = arr1[i][j] + arr2[i][j];
		}
		
	}
	System.out.println("Sum of multydimestion array 1st and 2nd: ");
	for(int i = 0; i < r; i++) {
		for(int j = 0; j < c; j++) {
			System.out.print(arrsum[i][j] + " ");
		}
		System.out.println();
	}
	int arrdif[][] = new int [r][c];
	for(int i = 0; i < r; i++) {
		for(int j = 0; j < c; j++) {
			arrdif[i][j] = arr1[i][j] - arr2[i][j];
		}
	}
	System.out.println("Difference of multydimestion array 1st and 2nd:" );
	for(int i = 0; i < r; i++) {
		for(int j = 0; j < c; j++) {
			System.out.print(arrdif[i][j]+ " ");
		}
		System.out.println();
	}
	}

}
