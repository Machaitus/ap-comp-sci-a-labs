/**
 * Name: Clay Roberson
 * Date: 09/09/19
 * Program: Lab 1.4
 * Purpose: To practice using arithmetic operators, writing arithmetic formulas with variables, calculating equations, and printing results in an elegant manner.
 */


public class lab1_4
{

    public static void main(String [] args)
    	{
    		String myName = "Programmer Name: Clay Roberson"; // Setting a variable for my name to later be printed
    		int history = 84; // Setting the first grade variable as a History class
    		int science = 91; // Setting the next grade variable as a Science class
    		int english = 62; // Setting the next grade variable as a English class
    		int sumGrade = history + science + english; // Getting the sum of all of the variables
    		double average;
    			average =sumGrade / 3; // Getting the avergae of the class grades
    		double variance = (Math.pow((history - average), 2) + Math.pow((science - average), 2) + Math.pow((english - average), 2))/3; //Finding the Variance of the previous grades. Was having issues with the number coming out very large like 79152.66666 turns out I printed the average on the same line go me
    		double deviation = Math.sqrt(variance); // Equation used to find the variance. Note: Using Math.sqrt in a (p,q) format brings up the error that explains "Looking for: (double) Found: (double,double)"
    		System.out.println(myName);
    		System.out.println("Average: " + (int)average);
    		System.out.println("Variance: " + variance);
    		System.out.print("Standard Deviation: " + deviation);

    	}


}