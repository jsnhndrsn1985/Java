
/**
 * Write a description of class MeanCalculator here.
 * 
 * @author (Jason Henderson) 
 * @version (Chapter 9 - Project 1)
 */

import java.util.InputMismatchException; //https://docs.oracle.com/javase/7/docs/api/java/util/InputMismatchException.html
import java.util.Scanner;

public class MeanCalculator
{

    public static void main(String[] args)
    {
    double total = 0, N, input;
    
    //Scanner
    Scanner keyboard = new Scanner(System.in);
        while (true)
        {
            System.out.println("" + "How many numbers will be averaged?");
            input = keyboard.nextDouble();
                
            //validate
                if(input > 0)
                    {
                            N = input;
                            break;
                    }
                 else
                    System.out.println("N must be positive.");
        }  
        
        //user input
        for (int i = 0; i < N; i++)
        {
                while (true)
                {
                    System.out.println("Enter a number:");
                    
                    try
                    {
                        input = keyboard.nextDouble();
                        total += input;
                        break;
                    }
                    catch (InputMismatchException e)
                    {
                           keyboard.nextLine();
                           System.out.println("Entry must be a number");
                    }
                }
        }
        System.out.println(total/N);
    }
}


