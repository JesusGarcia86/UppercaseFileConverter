import java.util.Scanner;
import java.io.*;

public class UppercaseFileConverter {

	public static void main(String[] args) throws IOException {
		
		Scanner keyboard = new Scanner(System.in);
		String filename;
		
		filename = keyboard.nextLine();
		
		File file = new File( filename );
		
		if(!file.exists()) {
			System.out.print("Enter the name of the file to be read: The file " + filename + " does not exist or could not be opened.");
			System.exit(0);
		}
		
		keyboard = new Scanner(file);
		
		if(file.exists()) {
		System.out.println("Enter the name of the file to be read: Here is the file converted into Uppercase.");
		}
		while( keyboard.hasNext() ) {
			String fileName = keyboard.nextLine();
			String Upper = fileName.toUpperCase();
			System.out.println(Upper);
		}
		System.out.println("Files read, converted and then closed.");
		keyboard.close();
	}

}