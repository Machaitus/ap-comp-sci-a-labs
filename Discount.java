/**
 * Name: Clay Roberson
 * Lab: Discount
 * Purpose: To practice if statements, multi-level decision making, printf, rounding
 */

import java.util.Scanner;

public class Discount
{

    public static void main(String [] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter bill amount: ");
        double bill = userInput.nextDouble();

        double paidEarly = bill * .85;
        double earlySaving = bill - paidEarly;
        double paidOnTime = bill * .95;
        double onTimeSaving = bill - paidOnTime;
        double paidLate = bill * 1.05;
        double lateFee = paidLate - bill;

        if (detector(bill) == true)
        {
            System.out.print("Your bill amount is: $");
            System.out.printf("%.2f\n", bill);
            System.out.print("If paid within 10 days you will save: $");
            System.out.printf("%.2f", earlySaving);
            System.out.print(" and owe: $");
            System.out.printf("%.2f\n", paidEarly);
            System.out.print("If paid within 30 days you will save: $");
            System.out.printf("%.2f", onTimeSaving);
            System.out.print(" and owe: $");
            System.out.printf("%.2f\n", paidOnTime);
            System.out.print("If paid late you will pay an additional: $");
            System.out.printf("%.2f", lateFee);
            System.out.print(" and owe: $");
            System.out.printf("%.2f", paidLate);
        }
        else
        {
            System.out.print("You owe: $");
            System.out.printf("%.2f\n", bill);
            System.out.print("If paid late you will pay an additional: $");
            System.out.printf("%.2f", lateFee);
            System.out.print(" and owe: $");
            System.out.printf("%.2f", paidLate);
        }
    }

    private static boolean detector(double bill)
    {
        if (bill > 1000)
            return true;

        else
            return false;
    }
}