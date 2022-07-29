package lockers_pvt_lmt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Work_Service {

	
	protected static String[] sort_arr(String array[], int size) {   // sorting function
		String temp = "  ";
		for (int i = 0; i < size; i++) {
			for (int j = 1; j < (size - i); j++) {
				if (array[j - 1].compareToIgnoreCase(array[j]) > 0) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	
	protected static void list_Files() {

		int fileCount = 0;
		ArrayList<String> filenames = new ArrayList<String>();

		File directoryPath = new File(System.getProperty("user.dir"));
		File[] listOfFiles = directoryPath.listFiles();
		fileCount = listOfFiles.length;

		System.out.println("Files in ascending fashion: ");
		for (int i = 0; i < fileCount; i++) {
			if (listOfFiles[i].isFile()) {
				filenames.add(listOfFiles[i].getName());
			}
		}

		String[] str = new String[filenames.size()];

		for (int i = 0; i < filenames.size(); i++) {
			str[i] = filenames.get(i);
		}

		String[] sorted_filenames = sort_arr(str, str.length);

		for (String currentFile : sorted_filenames) {
			System.out.println(currentFile);
		}

	}

	
	protected static void delete_File(String file_To_Be_Deleted) {

		File file = new File((System.getProperty("user.dir")) + "\\" + file_To_Be_Deleted);

		if (file.exists()) {
			if (file.delete()) {
				System.out.println("File deleted successfully!");
			}
		} else {
			System.out.println("Sorry,File Not Found");
		}
	}

	
	protected static void search_File(String file_To_Be_Searched) {

		File file = new File((System.getProperty("user.dir")) + "\\" + file_To_Be_Searched);

		if (file.exists()) {
			System.out.println("File found!");
		} else {
			System.out.println("Sorry,File Not Found");
		}
		PrintWriter pw;
		try {
			pw = new PrintWriter(file_To_Be_Searched); // may throw exception
			pw.println("saved");
		}
		// providing the checked exception handler
		catch (FileNotFoundException e) {

			System.out.println(e);
		}
	}

	
	protected static void create_File(String file_To_Be_Created) {
		File file = new File((System.getProperty("user.dir")) + "\\" + file_To_Be_Created);

		try {
			if (file.createNewFile()) {
				System.out.println("File Created");
			} else {
				System.out.println("File already exists :(");
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
