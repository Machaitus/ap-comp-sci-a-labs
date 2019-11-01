/**
 * Name: Clay Roberson
 * Date: 10/08/19
 * Program: PigsKnowBest
 * Purpose: To create a code that allows multiple "pig" in a single sentence, but doesn't allow single "pig". Cause one pig doesn't bring home enough bacon
 */



public class PigsKnowBest
{
	public static void main(String[] args)
	{

		String pigs = "pigarethebest"; // String code is checking for "pig"
		boolean morePigs = pigs.indexOf ("pig") > -1; // Boolean testing to see if "pig" exists in the initial string
		boolean anotherPig = (pigs.substring (pigs.indexOf ("pig") + 3).indexOf ("pig")) > -1; // boolean testing if a second "pig" exists
		String answer = str(anotherPig); // calling upon the method that converts the boolean into strings

		System.out.print(answer); // printing the return results

	}

	public static String str(boolean anotherPig)
	{

		if (anotherPig) // if the variable anotherPig returns true it returns with the String "Yes"
			return "Yes";

		else // if the variable anotherPig returns false it returns with the String "No"
			return "No";

	}

}