/**
 * Name: Clay Roberson
 * Date: 09/09/19
 * Program: Lab 1.5
 * Purpose: Write a program to give exact change with the least number of coins for a given number of cents. Use intermediate variables to help your calculation.
 */

public class lab1_5
{
    public static void main (String [] args)
    {

    		int totalCents = 1457; // Setting the total cent value

    		int quarters = totalCents / 25; // Setting how many quarters can be found in the total
    		int quartersRem = totalCents % 25; // Finding the remainder after quarters are removed

    		int dimes = quartersRem / 10; // Dividing by 10 to find the dimes
    		int dimesRem = quartersRem % 10; // Finding the remainder after the dimes are removed

    		int nickels = dimesRem / 5; // Dividing by 5 to find nickels

    		int pennies = dimesRem % 5; // Finding the remainder after the dimes are removed


    		System.out.print(quarters + " quarters, ");
    		System.out.print(dimes + " dimes, ");
    		System.out.print(nickels + " nickels, ");
    		System.out.print(pennies + " pennies.");

    }


}