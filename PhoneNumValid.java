/**
 * Name: Clay Roberson
 * Date: 09/09/19
 * Program: Lab 1.4
 * Purpose: This lab will focus on strings, decision making (if statments) and parameter passing. Cause we don't want any Nigerian Princes with a large sum of money calling us
 */


public class PhoneNumValid
{

	    	private String str = "806-668-4586";
    		private int first = 0;//(str.indexOf("-")) + 1;
    		private int length = 0;//str.length();
    		private int second = 0;//(str.indexOf("-", first)) + 1;
    		private String lastFour = "";//str.substring(8);
    		private String finalAns = "";//phoneNums(first, second, length, lastFour);


   /** public PhoneNumValid(String st, int fir, int sec, int len)
    {

    	length = len;
    	first = fir;
    	second = sec;

    }
*/
    public void phoneNumSetter(String st, int fir, int sec, int len)
    {

    	first = (str.indexOf("-"));
    	second = (str.indexOf("-", first));
    	length = str.length();
    }

    public String phoneNumAnalysis(int fir, int sec, int len)
    {

    	if ( first == 3 && second == 7 && length == 12)
    		return str.substring(len - 4);

    	else
    		return "Bad Number";

    }

    public static void main (String [] args)
    	{
    		PhoneNumValid test = new PhoneNumValid();
    		System.out.println(phoneNumAnalysis);
    	}

}