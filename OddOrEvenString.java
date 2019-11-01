/*
 * Name: Clay Roberson
 * Date: 09/09/19
 * Program: OddOrEvenString
 * Purpose: Determine if a String is even or odd. An even number has a remainder of zero when being divided by two. An odd number is any number that does not have a remainder of zero when being divided by 2. We need to figure out why an error is so odd after all
 */

import java.util.Scanner; // import the scanner

public class OddOrEvenString {


    public static void main(String [] args)
    {
    	Scanner userInput = new Scanner(System.in);
    	System.out.print("Enter a word::");

		String testWord = userInput.nextLine();
		int evenNumber = testWord.length() % 2;

		if (evenNumber == 0)
			System.out.println(testWord + " is even.");

		else
			System.out.println(testWord + " is odd.");
    }



}

