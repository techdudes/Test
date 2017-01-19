import java.util.Scanner;

public class Alphabets {
	public static void main(String[] args) {
		Scanner scanChar = new Scanner(System.in);
		System.out.println("enter an alpahabet");
		String scannedChar = scanChar.next();
		char c = scannedChar.charAt(0);
		if (c < 65 || c > 90 && c < 97 || c > 122) {
			System.out.println("enter a valid alphabet");
		} else {
			if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U')
				System.out.println(" " + c + "is a vowel");
			else
				System.out.println(" " + c + "is a vowel");

		}
		scanChar.close();
	}

}
