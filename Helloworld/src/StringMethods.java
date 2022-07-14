
public class StringMethods {

	public static void main(String[] args) {

		String s= "Hello World";
		System.out.println("Length= "+ s.length());
		System.out.println("Index of W = " + s.indexOf('W'));
		
		// print the character at position 3
		System.out.println("Character at 3 = " + s.charAt(3));
		//System.out.println("Character at 3 = " + s.charAt(12));// invalid since input string size is less
		
        System.out.println("Command after exception");
        System.out.println("Index of  l =" + s.indexOf('l'));
        System.out.println("Index of second l =" + s.indexOf('l',3));
        System.out.println("Index of third l =" + s.indexOf('l',4));
       //substring- printing a part of string
        System.out.println("substring: "+s.substring(3));
        
        //only want lowo in string
        System.out.println("substring: "+s.substring(3,8));
        
        // string split
        String[] s2=s.split(" ");
        System.out.println(s2[0]);
        System.out.println(s2[1]);
        
        String[] s3= s.split("o");
        System.out.println(s3[0]);
        System.out.println(s3[1]);
        System.out.println(s3[2]);
        
        System.out.println("index of space : " + s.indexOf(" "));
        System.out.println("Replaced: "+ s.replace("l","j"));
        
        System.out.println("upper case" + s.toUpperCase());
        System.out.println("upper case"+ s.toLowerCase());
        
       
        
        
        
        
        
        
        		
        
	}
	
	
	

}
