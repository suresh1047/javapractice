package arrays;
import java.util.Scanner;
public class ArraySorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array elements length: ");
		int n = sc.nextInt();
		int [] arr = new int [n];
		System.out.println("Enter array elemets: ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Array element after shorting: ");
		for (int element : arr) {
			System.out.print(element + " ");
		}

	}

}
