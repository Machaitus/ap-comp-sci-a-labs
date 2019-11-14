/**
 * Name: Clay Roberson
 * Date: 11/08/19
 * Program: Sting Ends With
 * Purpose: Write a program to check two parameters. If a > b, return a - b. If b > a, return b - a. If a == b, return a * b.
 */
import java.util.Scanner;


public class AddSubMult
{
    public static void main(String [] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a: ");
        double parameterA = userInput.nextDouble();
        System.out.println("Enter b: ");
        double parameterB = userInput.nextDouble();

        double aIsLess = parameterB - parameterA;
        double bIsLess = parameterA - parameterB;
        double equal = parameterA * parameterB;

        if (detectorOne(parameterA, parameterB) == true)
            System.out.println(aIsLess);

        if (detectorTwo(parameterA, parameterB) == true)
            System.out.println(bIsLess);

        if (detectorThree(parameterA, parameterB) == true)
            System.out.println(equal);

        else
            System.out.println();

    }

    private static boolean detectorOne(double parameterA, double parameterB)
    {

        if (parameterA < parameterB)
            return true;
        else
            return false;

    }

    private static boolean detectorTwo(double parameterA, double parameterB)
    {

        if (parameterA > parameterB)
            return true;
        else
            return false;
    }

    private static boolean detectorThree(double parameterA, double parameterB)
    {

        if (parameterA == parameterB)
            return true;
        else
            return false;

    }

}