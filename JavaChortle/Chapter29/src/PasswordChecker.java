import java.util.Scanner;

public class PasswordChecker {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean isAcceptable = false;
		boolean hasDigit = false;
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;

		System.out.println("Enter your password:");
		String password = in.nextLine();

		for(int i = 0; i < password.length(); i++ ) {
			char currChar = password.charAt(i);
			if (Character.isUpperCase(currChar)) { hasUpperCase = true; }
			if (Character.isLowerCase(currChar)) { hasLowerCase = true; }
			if ((currChar >= '0' && currChar <= '9')) { hasDigit = true; }
		}

		if(hasDigit && hasLowerCase && hasUpperCase && password.length() >= 7) {
			System.out.println("Acceptable password.");
		}
		else {
			System.out.println("That password is not acceptable");
			main(args);
		}
	}
}
