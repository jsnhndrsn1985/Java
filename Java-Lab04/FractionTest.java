
/**
 * Write a description of class FractionTest here.
 * 
 * @author (Jason Henderson) 
 * @version (Chapter 4 - Project 2 - Test)
 */

public class FractionTest
{
    public static void main(String[] args)
    {
         Fraction fracTest = new Fraction();   
       
         fracTest.userInput();
         fracTest.numDen();
         System.out.println("Here is the result of the numerator divided by the denominator: " + (fracTest.numerDouble()) / (fracTest.denomDouble()));         
         fracTest.Lowest();
         
        
    }
   
    
}
