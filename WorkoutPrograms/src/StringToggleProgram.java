import java.util.Scanner;

public class StringToggleProgram {
	public static void main(String[] args) {
		System.out.println("Enter a Word with toggled alphabets");
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		char[] characterArray = line.toCharArray();
		for (char ch : characterArray) {
			if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
			}
			System.out.print(ch);
			scan.close();
		}
	}
}
