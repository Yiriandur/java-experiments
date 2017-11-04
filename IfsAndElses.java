package noName;
/*
 Author: Carina
 	if(hasDriversLicense == true)
	{
		System.out.println("You may drive"); // read: System.out.println(numerator/divisor);  
	}
	else
	{
		System.out.println("Find a ride");
	}
	
	OR without curly brackets if only ONE statement is true and ONE is false, is exactly equivalent:
	
	if(divisor > 0)
		System.out.println(numerator/divisor);
 */



//Scanner CLASS needs to be imported to be able to use.
import java.util.Scanner;

public class IfsAndElses {
	
	public static void main (String[] args) {
	
	//Read a number from the user and print whether it is positive or negative
	Scanner in = new Scanner(System.in);
	System.out.println("Enter an integer: ");
	int num = in.nextInt();
	//start conditional operator
	if(num >= 0)
		System.out.println("nr is positive");
	else
		System.out.println("nr is negative");
	in.close();
}
}

