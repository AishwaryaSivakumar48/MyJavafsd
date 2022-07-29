package lockers_pvt_lmt;

import java.io.IOException;
import java.util.Scanner;

public class Lockers_pvt_lmt {

	public static void main(String[] args) throws IOException {
		int d = 0, choice_of_user = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Locked Me.com");
		System.out.println("An application by Locker Pvt Ltd :) \n");
		System.out.println(
				"Developed by: Aishwarya Sivakumar \nEmail: aishwarya.sivakumar@gmail.com \nContact: 9876543210");

		while (true) {
			System.out.println("Choose one of the approriate options below:");
			System.out.println("1. List Current Files");
			System.out.println("2. Service");
			System.out.println("3. Close Application");
			try {
				d = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Exception occurred");
			}

			switch (d) {
			case 1:
				Work_Service.list_Files();
				break;
			case 2:

				System.out.println("Choose one of the approriate options below:");
				System.out.println("1. Add a File");
				System.out.println("2. Delete a File");
				System.out.println("3. Search for a File");
				try {
					choice_of_user = sc.nextInt();
				} catch (Exception e) {
					System.out.println("Exception occurred");
				}
				switch (choice_of_user) {
				case 1:

					System.out.println("Enter the file name to be created: "); // Creation of a file takes place
					String fileCreate = sc.next();
					Work_Service.create_File(fileCreate); // Calling the function to create the file
					break;

				case 2:

					System.out.print("Enter the file name to be deleted: "); // deletion of a file takes place
					String fileDelete = sc.next();
					Work_Service.delete_File(fileDelete); // Calling the function to delete the file
					break;
				case 3:

					System.out.println("Enter the file name to be searched: "); // Search for a file takes place
					String fileSearch = sc.next();
					Work_Service.search_File(fileSearch); // Calling the function to search the file
					break;

				default:

					System.out.println("Invalid Input,Repeat the process"); // In the case of unprecedented input															// execute this
					break;
				}

				break;
			case 3:

				sc.close();
				System.out.println("Application exit"); // Voluntarily exiting the application
				System.exit(1);
				break;

			default:

				System.out.println("Invalid Input, Select within the range of 1-3"); // In the case of unprecedented																	// input execute this
				break;

			}
		}

	}

}