
public class Strings {
 public static void main(String[] args) {
	  
	 String s2= new String("Aishwarya");
	 System.out.println(s2);
	 
	 //char array way
	 char[]c= {'h','e','l','l','o'};
	 String s3 = new String (c);
	 System.out.println(s3);
	 
	 byte[] b = {65,66,67};
	 String s4= new String(b);
	 System.out.println(s4);
	 
	
	 // string literal 
	 String name = "Max Willam";
	 System.out.println("Name: "+ name);
	 System.out.println("Length of Name: "+ name.length());  //inlcudes space also
 }
}
