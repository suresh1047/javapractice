package arrays;
import java.util.Scanner;
public class OneDArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects: ");
		int n = sc.nextInt();
		float averageMarks = 0f;
		int[] marks = new int [n];
		System.out.print("Enter all subjects marks here: ");
		for(int i = 0; i < n; i++) {
			marks[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			averageMarks += marks[i];
		}
		averageMarks /= n;
		System.out.println("average marks: "+averageMarks);

	}

}
