/*2.6.1 Writing a program in Java to verify implementations of strings, StringBuffer, and StringBuilder
2.6.2 Executing the program and verifying working of strings
2.6.3 Pushing the code to your GitHub repositories*/

public class strings {

	public static void main(String[] args) {
		
				System.out.println("Methods of Strings");
				
				String sl=new String("Java Programming");
				System.out.println(sl.length());

				//substring
				String sub=new String("I love cat");
				System.out.println(sub.substring(4));

				//String Comparison
				String s1="KitKat";
				String s2="KitKut";
				System.out.println(s1.compareTo(s2));

				//IsEmpty
				String s4="";
				System.out.println(s4.isEmpty());

				//toLowerCase
				String s5="Hello";
				System.out.println(s1.toLowerCase());
				
				//replace
				String s6="Kikut";
				String replace=s2.replace('u', 'a');
				System.out.println(replace);

				//equals
				String x="Java Programming";
				String y="Java PrOgramming";
				System.out.println(x.equals(y));
		 
				System.out.println("\n");
				System.out.println("Creating StringBuffer");
				StringBuffer s=new StringBuffer("Welcome to My home!");
				s.append("Have tea please!");
				System.out.println(s);

				//insert method
				s.insert(0, 'w');
				System.out.println(s);

				//replace method
				StringBuffer sb=new StringBuffer("Cricket");
				sb.replace(0, 2, "KiT");
				System.out.println(sb);

				//delete method
				sb.delete(0, 1);
				System.out.println(sb);
				
				//StringBuilder
				System.out.println("\n");
				System.out.println("Creating StringBuilder");
				StringBuilder sb1=new StringBuilder("Java");
				sb1.append("Programming");
				System.out.println(sb1);

				System.out.println(sb1.delete(0, 1));

				System.out.println(sb1.insert(1, "Happy"));

				System.out.println(sb1.reverse());
						
				//conversion	
				System.out.println("\n");
				System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
				
				String str = "Cricket"; 
		        
		        // conversion from String object to StringBuffer 
		        StringBuffer sbr = new StringBuffer(str); 
		        sbr.reverse(); 
		        System.out.println("String to StringBuffer");
		        System.out.println(sbr); 
		          
		        // conversion from String object to StringBuilder 
		        StringBuilder sbl = new StringBuilder(str); 
		        sbl.append("world"); 
		        System.out.println("String to StringBuilder");
		        System.out.println(sbl);              		
			}
	
	}

