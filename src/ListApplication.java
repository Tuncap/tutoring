import java.util.Scanner;

public class ListApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student[] studentList = new Student[5];

		int count = 0;
		int userInput = 0;

		while (userInput != 3) {
			System.out.printf(
					"1. Enter Student Information.\n2. Print Student Information.\n3. Exit the program. \nSelect an option: ");
			userInput = scanner.nextInt();
			System.out.println();

			if (userInput == 3) {
				continue;
			}

			boolean isValidInput = userInput == 1 || userInput == 2;
			if (!isValidInput) {
				System.out.println("Input not valid...\n");
				continue;
			}

			if (userInput == 1) {
				scanner.nextLine();
				System.out.print("Enter First Name: ");
				String firstName = scanner.nextLine();
				System.out.print("Enter Last Name: ");
				String lastName = scanner.nextLine();
				System.out.print("Enter GPA: ");
				float stuGPA = scanner.nextFloat();
				scanner.nextLine();

				Student student = new Student(firstName, lastName, stuGPA);

				for (int i = 0; i < 3; i++) {

					System.out.println("\nEnter address " + (i + 1));
					System.out.print("Street: ");
					String street = scanner.nextLine();
					System.out.print("City: ");
					String city = scanner.nextLine();
					System.out.print("State: ");
					String state = scanner.nextLine();
					System.out.print("Zip: ");
					String zip = scanner.nextLine();

					Address address = new Address(street, city, state, zip);
					student.addAddress(address);
				}
				studentList[count] = student;
				count++;
			}

			if (userInput == 2) {
				for (int i = 0; i < studentList.length; i++) {
					Student student = studentList[i];
					if (student != null) {
						System.out.println(student);
					}
				}
			}

		}
		scanner.close();
	}
}