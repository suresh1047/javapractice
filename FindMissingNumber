package arrays;

import java.util.Scanner;

public class FindMissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array element length: ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the array element: ");
		for(int i = 0; i < arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		int sumOfAll = 0;
		int sumOfArray = 0;
		int missNum = 0;
		sumOfAll = n*(n+1)/2;
		for(int i = 0; i < arr.length; i++) {
			sumOfArray = arr[i]+ sumOfArray; 
		}
		missNum = sumOfAll - sumOfArray;
		System.out.println("Missing number is "+missNum);
	}

}
