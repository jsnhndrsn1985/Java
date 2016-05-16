/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stereocredit;

/**
 *
 * @author Jason Henderson - Chapter 3 - Project 5
 */

import java.text.NumberFormat;
import java.util.Locale;

public class StereoCredit {
    
     
	public static void main(String[] args)
	{
            NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
                
                double originalCost = 1000.00;//original cost
                double stereoCost = 1000.00; //Starting price
                double monthlyPayment =  50.00;// Monthly payment
                double interest = 0.015; // interest
		int months = 0; // Counter for months
		double paymentCounter = 0; // Counter for payments
		

		while (((stereoCost * interest) + stereoCost) >= monthlyPayment)
		{
			stereoCost = ((stereoCost * interest) + stereoCost) - monthlyPayment;
			paymentCounter = paymentCounter + monthlyPayment;
			months++;

                System.out.println("On month " + months + ", the current total on the credit card is " + moneyFormatter.format(stereoCost) + " and the total amount that has been paid so far is " + moneyFormatter.format(paymentCounter) +".");
                
		}
                        if (stereoCost > 0)
		{
			stereoCost = ((stereoCost * interest) + stereoCost);
			paymentCounter = paymentCounter + stereoCost;
			months++;
		}

		double interestFinal = paymentCounter - originalCost;

		System.out.println("The total amount of interest that was paid was " + moneyFormatter.format(interestFinal) + ".");
                System.out.println("It took " + months + " months to pay off the stereo.");
        }
    
}
