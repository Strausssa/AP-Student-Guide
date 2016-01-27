import java.util.*;

public class SecretCode {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);

		String keyphrase = in.nextLine();
		String encoded = in.nextLine();
		String decoded = "";
		String[] encodedArr = encoded.split(" ");

		for(int i = 0; i < encodedArr.length; i++) {
			decoded = decoded + keyphrase.charAt(Integer.parseInt(encodedArr[i]));
		}

		System.out.println(decoded);
	}
}
