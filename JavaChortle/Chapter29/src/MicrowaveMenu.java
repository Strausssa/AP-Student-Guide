import java.util.Scanner;

public class MicrowaveMenu {
	public static void main(String[] args) {
		int ayy;
		System.out.println("Enter cook time");
		Scanner in = new Scanner(System.in);
		ayy = in.nextInt();
		if(String.valueOf(ayy).length() <= 2) {
			System.out.println("Your time " + ayy + " seconds");
		}
		else {
			String str = "" + ayy;
			String firstChar = str.substring(0, str.length()-2);
			int intForFirst4Char = Integer.parseInt(firstChar);
			int lastTwo = ayy % 100;
			System.out.println("Your time " + intForFirst4Char + ":" + lastTwo);
		}
	}
}
