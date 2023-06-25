package assingments;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileProgram {
	public static void main(String[] args) {
		System.out.println("Welcomet to the value reader application. \n"
				+ "This program will load value.txt from disk.  If it does not exist then one will be created.\n ");

		// Read the content from file
		String fileContents = "";

		try {
			FileReader fileReader = new FileReader("./value.txt");
			Scanner myReader = new Scanner(fileReader);
			while (myReader.hasNextLine()) {
				fileContents = fileContents + myReader.nextLine();
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

		System.out.println("Value stored in file (if found): " + fileContents);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type whatever you want to update file: ");
		String userEnteredValue = scanner.nextLine();

		System.out.println("Cool.  Writing " + userEnteredValue + " to a value.txt");
		try {
			// Creates a FileWriter
			FileWriter output = new FileWriter("./value.txt");

			// Writes the string to the file
			output.write(userEnteredValue);

			// Closes the writer
			output.close();
			System.out.println("file saved");
		}
		catch (Exception e) {
			System.out.println("error saving file");
		}

	}

}
