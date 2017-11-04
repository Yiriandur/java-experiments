package noName;
/*
@author Carina 
Dice // Random Dice Roll

Generic formula.
	Given bounds a and b:
		(int) Math.random() * (b - a + 1)
		gives integers between 0 and b-a,
		then add a, yielding a value between a and b:
		int r = (int)(Math.random() * b-a+1)) + a;
		or
		int r = (int)(Math.random() * b) + a;
	
	For this program, we want numbers between 1 and 6, plug in 1 for a and 6 for b:
		int r = (int)(Math.random() * (6-1+1)) + 1;
		or
		int r = (int)(Math.random() * 6) + 1;
*/



//define the method Dice
public class Dice {

	public static void main (String[] args) {
		//a for-loop which executes 10 times from 0 to 9.
		for(int i = 0; i < 10; i++)
		{
			// Generate two random numbers beween 1 and 6

			// First diceroll D1. Math with closed parentheses because it is a method, x6 due to high limit 6 and add 1 because i don't want 0-5 but 1-6.
			int d1 = (int)(Math.random() * 6) + 1;
			// Second diceroll D2.
			int d2 = (int)(Math.random() * 6) + 1;
			System.out.println(d1 + " " + d2);
		}
		
		System.out.println();
			
	}
}
