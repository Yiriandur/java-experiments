package noName;
/*
 	@author Carina 
 	Scope:		Problem: Write a program that asks the user to input:
		    	The number of gallons of gas in the tank
	   			The fuel efficiency in miles per gallon
    			The price of gas per gallon
				Then print the cost per 100 miles and how far the car can go with the gas in the car..  
	Algorithm:	1) prompt the user for gallons of gas in the car / allow fractions
				2) capture the return value in inTheTank type = float
				3) proment the user for mpg / allow whole number only 
				4) capture the returned value in mpg type = int
				5) prompt the user for price of gas / allow fractions
				6) capture the returned value in gasPrice type = float
				7) output: "With gas at $" + gasPrice + " per gallon, going 100 miles will cost you $" + (gasPrice * 100)
				8) output: "Since your car's efficiency is " + mpg + " mpg and given that you have " +  inTheTank + " gallons in the tank, by my calculations you can go " + (int)(mpg * inTheTank) + " miles before you run out of gas."
*/




// import needed package
import java.util.Scanner;
	// declare class
	public class MPG {
		//declare the main method
		public static void main(String[] args) {
			// welcome the user
			System.out.println("I can calculate the cost of driving your car for 100 miles. I can also say how far you can go with what is in your tank.");
			// get ready to read the user data
			Scanner keyboard = new Scanner(System.in);
			// prompt the user for gas in the gas tank
			System.out.print("How many gallons of gas do you have in your gas tank? You may use fractions: ");
			float inTheTank = keyboard.nextFloat();
			// prompt the user for mpg
			System.out.print("How many miles per gallon does your car drive? Please use a whole number: ");
			int mpg = keyboard.nextInt();
			// prompt the user for gas price
			System.out.print("How much does a gallon of gas currently cost? You may use fractions: ");
			float gasPrice = keyboard.nextFloat();
			keyboard.close();
			 
			// start the output
			System.out.println("----------------------------------------------------------------------");
			System.out.println("With gas at $" + gasPrice + " per gallon, going 100 miles will cost you $" + (gasPrice * 100) );
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Since your car's efficiency is " + mpg + " mpg and given that you have " +  inTheTank + " gallons in the tank, by my calculations you can go " + (int)(mpg * inTheTank) + " miles before you run out of gas.");
			System.out.println("----------------------------------------------------------------------"); 
			 
		}
	}
