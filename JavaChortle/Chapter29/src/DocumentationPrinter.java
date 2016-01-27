import java.util.Scanner;

public class DocumentationPrinter {
	public static void main (String args[]) {

		Scanner in = new Scanner(System.in);
		while ( in.hasNextLine() ) { 
			String line = in.nextLine();
      		if (line.substring(0,2).equals("//") || line.substring(0,2).equals("")) {
      			System.out.println(line);
      		}
    	}
    	System.out.println("\n");
	}
}
