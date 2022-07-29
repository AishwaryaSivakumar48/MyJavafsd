 
import java.util.ArrayList;
import java.util.Scanner;

public class MailValidation {

	public static void main(String[] args) {
		
		ArrayList<String> Mail_ID = new ArrayList<String>();
		 Mail_ID.add("aishwarya.ec18@bitsathy.ac.in");
		 Mail_ID.add("ambika.ec18@bitsathy.ac.in");
		 Mail_ID.add("cintheya.ec18@bitsathy.ac.in");
		 Mail_ID.add("dhanushree.ec18@bitsathy.ac.in");
		 Mail_ID.add("harrini.ec18@bitsathy.ac.in");
		 Mail_ID.add("thilagavathi.ec18@bitsathy.ac.in");
		 String search_Mail_id = null;
         System.out.println("Validation of Email ID");
         Scanner sc = new Scanner(System.in);
         search_Mail_id = sc.toString();
         
         System.out.println("Enter mail id to validate:");
         String sr=sc.next();
      //   System.out.println(sr);
         
         boolean ans= Mail_ID.contains(sr);
         if(ans)
         {
        	 System.out.println("Email Id found successfully at position "+ Mail_ID.indexOf(sr));
        	
         }
         else {
        	 System.out.println("Email Id entered is not found in the list");
         }
      
}
}     