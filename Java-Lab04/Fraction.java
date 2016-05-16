
/**
 * @author (Jason Henderson) 
 * @version (Chapter 4 - Project 2)
 */

import java.util.Scanner;

public class Fraction
{
    
    private int numerator;
    private int denominator;

    public Fraction()
    {
         // initialise instance variables
        numerator = 0;
        denominator = 1;
    }

    public void userInput()
    {
        //user inputs numerator and denominator
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter the numerator.");
        numerator = keyboard.nextInt();
        System.out.println("Please enter the denominator.");
        denominator = keyboard.nextInt();
        
                
    }
    
    public void numDen()
    {
        System.out.println("Here is your fraction: " + numerator + "/" + denominator); 
    }
    
    public double denomDouble()
    // Returns denominator and a double when called
        {
            return (double)denominator;
        }
        
    public double numerDouble()
    // Returns denominator and a double when called
        {
            return (double)numerator;
        }
    
 
    public void Lowest()
    {
        int lcd = 0; //lowest common denominator
        int i; //iteration
        
        for (i = 1; i <= numerator; i++)
            {
                if(( numerator % i == 0) && (denominator % i == 0))
                    lcd = i;
                
            }
            
            System.out.println("Here is your fraction in lowest terms: " + (numerator / lcd) + "/" + (denominator / lcd)); 
            
    }
    
    
    
}
