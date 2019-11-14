/**
 * Name: Clay Roberson
 * Date: 09/08/19
 * Program: Sting Ends With
 * Purpose: This lab was designed to test the understanding of ifs statements and string methods.
 */


public class StringEndsWith
{
    public static void main(String [] args)
    {
			String mainString = "alligator";
    		String mainSubstring = "gator";

			if (detector(mainString, mainSubstring) == true)
			   	System.out.print("It is true that " + mainString + " ends with " + mainSubstring);

			else
				System.out.print("It is not true that " + mainString + " ends with " + mainSubstring);
    }

    private static boolean detector(String mainString, String mainSubstring)
    {

    		int mainStringLen = mainString.length();
    		int mainSubLen = mainSubstring.length();
    		String stringEnd = mainString.substring(mainStringLen - mainSubLen);

    		if (stringEnd.equals(mainSubstring))
    			return true;

    		else
    			return false;
    }
}