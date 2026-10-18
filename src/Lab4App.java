/**
 * Title: The Lab4 Application class
 *
 * Description: This class tests the various methods in the Card class to see what is 
 * returned and determines if the methods work properly.
 *
 * @author <your names here>
 */

public class Lab4App 
{
	public static void main(String[] args)
	{
		Card card1 = new Card(24);
		System.out.println("Card 1: " + card1.toString());
		System.out.println("Card 1's value is: " + card1.getValue());
		System.out.println("Card 1's suit is: " + card1.getSuit());
			
	}
}