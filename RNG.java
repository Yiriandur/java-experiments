package noName;
/*
@author Carina 
Random Number Generator // RNG
*/



//define the method Random Number Generator
public class RNG {

	public static void main (String[] args) {
		//a for-loop which executes 10 times from 0 to 9.
		for(int i = 0; i < 10; i++)
		{
			// A random number of type double, set equal to the call of the function math.random
			// Generates a number between 0 and 1, can include 0 but never 1.
			double ranNumber = Math.random(); //included in java library
			System.out.println((i+1)+":  "+ranNumber);
		}
			
	}
}
