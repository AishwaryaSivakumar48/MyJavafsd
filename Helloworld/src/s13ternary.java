/**
 * 
 */

/**
 * @author Hi
 *
 */
public class s13ternary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int age= 16;
		boolean canDrive=(age>18)? true: false;
	
		boolean hasLicense=true;
		boolean canRentCar= canDrive? (hasLicense? true:false):false;
		System.out.println("Age = "+age);
		System.out.println("Has License = "+hasLicense);
		System.out.println("Can Drive ?" + canDrive);
		System.out.println("Can rent a car ?"+ canRentCar);
		
		System.out.println(" ");
		String result = canDrive ?(hasLicense? "has license can drive": "No license cant drive"):"cannot drive";		
		System.out.println(result);
	}
	

}
