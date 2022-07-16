import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		int num1,num2;
		char operator;
		System.out.println("Performing simple calculation using Arithmetic operators");
		System.out.println("Simple Calculator");
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter the number :");
		num1= s.nextInt();
		System.out.println("Please enter the number :");
		num2= s.nextInt();
		System.out.println("Please enter the operation to be performed(+,-,*,/,%):");
		operator = s.next().charAt(0);
	
		if(operator=='+')
		{
			System.out.println("Addition of "+ num1 + " and" + num2 + " is : " + (num1+num2));
		}
		else if(operator=='-')
		{
			System.out.println("Subtraction of "+ num1 + " and " + num2 + " is : " + (num1-num2));
		}
		else if(operator=='*')
		{
			System.out.println("Multiplication of "+ num1 + " and " + num2 + " is : " + (num1*num2));
		}
		else if(operator=='/')
		{
			System.out.println("Division of "+ num1 + " and " + num2 + " is : " + (num1/num2));
		}
		else if  (operator=='%')
		{
			System.out.println("Modulo of " + num1 + " and " + num2 + " is :" + (num1%num2));
		}
		else
			System.out.println("invalid operator");

	}

}
