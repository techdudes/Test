import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		Scanner scanValue = new Scanner(System.in);
		System.out.println("enter an number between 1 to 7");
		int number = scanValue.nextInt();
		String[] calendarArray = { "none", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" };
		if (number > 0 && number < 7) {
			int i = number;
			System.out.println("" + calendarArray[i]);
		} else {
			System.out.println("error:enter numbers between 1 and 7 only");
		}
		scanValue.close();
	}
}
