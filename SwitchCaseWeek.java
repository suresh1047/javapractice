package switchCase;
import java.util.Scanner;
public class SwitchCaseWeek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the week day: ");
		int day = sc.nextInt();
		switch(day) {
		case 1 : 
			System.out.println("Monday, office 1st working day");
			break;
		case 2 : 
			System.out.println("Tuesday, office working day");
			break;
		case 3 : 
			System.out.println("Wednesday, office working day");
			break;
		case 4 : 
			System.out.println("Thursday, office working day");
			break;
		case 5 : 
			System.out.println("Friday, office working day");
			break;
		case 6 : case 7 : 
			System.out.println("Saturday and Sunday is office weekend");
			break;
			default :
				System.out.print("Entered invalid day.");
				break;
		}
	}

}
