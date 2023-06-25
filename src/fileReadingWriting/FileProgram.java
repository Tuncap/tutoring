package assingments;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileProgram {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		System.out.println("Welcomet to the value reader application. \n"
				+ "This program will load value.txt from disk.  If it does not exist then one will be created.\n ");

		// Read the content from file
		String fileContents = "";

		FileReader fileReader = new FileReader("value.txt");
		Scanner myReader = new Scanner(fileReader);
		while (myReader.hasNextLine()) {
			fileContents = fileContents + myReader.nextLine();
		}

		System.out.println("Value stored in file (if found): " + fileContents);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type whatever you want to update file: ");
		String userEnteredValue = scanner.nextLine();

		System.out.println("Cool.  Writing " + userEnteredValue + " to a value.txt");

		// Creates a FileWriter
		FileWriter output = new FileWriter("value.txt");
		PrintWriter pw = new PrintWriter(output);
		// Writes the string to the file
		pw.printf(userEnteredValue);

		// Closes the writer
		output.close();
		System.out.println("file saved");

		scanner.close();
	}

}
