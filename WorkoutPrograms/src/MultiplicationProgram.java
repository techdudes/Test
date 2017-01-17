import java.util.Scanner;

public class MultiplicationProgram {
	public static void main(String[] args) {
		System.out.println("please enter the number to get its multiplication table");
		Scanner scanValue = new Scanner(System.in);
		int number = scanValue.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(number+ "*" +i + "="+ number*i);
		}
		scanValue.close();

	}
}
