import java.util.Scanner;

public class SumOfAllDigits {
	public static void main(String[] args) {
		Scanner scanValue = new Scanner(System.in);
		System.out.println("enter a number between 0 and 1000: ");
		int number = scanValue.nextInt();
		if (number > 0 && number < 1000) {
			int a = number % 10;
			int b = (number / 10) % 10;
			int c = (number / 100) % 10;
			int d = a + b + c;
			System.out.println("sum of the digits is " + d);
		} else {
			System.out.println("error:input number between 0 and 1000 and retry");
		}
		scanValue.close();
	}
}
