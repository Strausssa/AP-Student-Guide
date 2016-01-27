import java.util.Scanner;

public class TitleApplier {
	public static void main(String[] args) {
		String ayy;
		System.out.println("Enter a name:");
		Scanner in = new Scanner(System.in);
		ayy = in.nextLine();
		name(ayy);
	}
	
	public static void name(String s) {
		String ayy;
		Scanner in = new Scanner(System.in);
		
		if(s.toLowerCase().contains("fred") || s.toLowerCase().contains("elroy") || s.toLowerCase().contains("graham")) {
			System.out.println("Mr. " + s);
			System.out.println("Enter a name:");
			ayy = in.nextLine();
			name(ayy);
		}
		else if(s.toLowerCase().contains("amy") || s.toLowerCase().contains("buffy") || s.toLowerCase().contains("cathy")) {
			System.out.println("Ms. " + s);
			System.out.println("Enter a name:");
			ayy = in.nextLine();
			name(ayy);
		}
		else if (s == "") {
			return;
		}
		else {
			System.out.println(s);
			System.out.println("Enter a name:");
			ayy = in.nextLine();
			name(ayy);
		}
	}
}
