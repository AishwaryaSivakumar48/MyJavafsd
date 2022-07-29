import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

class file_creation{
	public void file_create() {
		File myFile=new File("test1.txt"); 
		try { 
		if (myFile.createNewFile()) {
			System.out.println("file created");
		}
		else {
			System.out.println("File already exists");
		}
		
	}catch (IOException ex) {
		System.out.println("file error..");
	}
	}
	
}
class file_writing{
	public void file_write() {
		String data="I am writing in the text document file using java";
		try {
		FileWriter output= new FileWriter("test1.txt"); 
		output.write(data);
		System.out.println("data written successfully");
		output.close();
		
	} catch (IOException ex) {
		System.out.println("File write error");
	}
		
	}
}

class file_reading{
	public void file_read() {
		try {
		      File myFile = new File("test1.txt");
		      Scanner myReader = new Scanner(myFile);
		      while (myReader.hasNextLine()) {
		        String output = myReader.nextLine();
		        System.out.println(output);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      
		    }
	}
}
class file_appending {
	public void update_file(){
	try {
    	FileWriter output= new FileWriter("test1.txt"); 
    	output.write("updated context");
    	output.close();
    }
    catch(IOException e) {
    	  System.out.println("Success...");    
    	
    }
}
}

public class File_handling {

	public static void main(String[] args) {
		file_creation obj= new file_creation();
		obj.file_create();
		file_writing obj1 =new file_writing();
		obj1.file_write();
		file_reading obj2=new file_reading();
		obj2.file_read();
		file_appending obj3=new file_appending();
		obj3.update_file();
		
	
	}
}


