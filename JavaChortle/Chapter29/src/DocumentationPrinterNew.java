import java.util.Scanner;

public class DocumentationPrinterNew {
	public static void main (String args[]) {

		Scanner in = new Scanner(System.in);
		boolean start = false;
		
		while ( in.hasNextLine() ) { 
			String line = in.nextLine();
			String imp = line.substring(0,2);
      		if (imp.equals("//") || imp.equals("") || imp.equals("*/") || start) {
      			System.out.println(line);
      		}
      		else  if (imp.equals("/*")) { 
      			System.out.println(line);
      			start = true;
      		}
      		else if(line.substring(line.length() - 2, line.length()).equals("*/")){
      			start = false;
      		}

    	}
    	System.out.println("\n");
	}
}
