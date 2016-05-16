/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costoftrip;

/**
 *
 * @author Jason Henderson - Chapter 2 - Project # 4
 */
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;

public class CostOfTrip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        
        Scanner travelInfo = new Scanner (System.in);
        
        System.out.println("What is the distance traveled in miles?");
            int milesTraveled = travelInfo.nextInt();
        System.out.println("How many miles per gallon does your car get?");
            int milesPerGallon = travelInfo.nextInt();
        System.out.println("What is the current price of gasoline?");
            double priceOfGas = travelInfo.nextDouble();
        
        double costOfTrip = (milesTraveled / milesPerGallon) * priceOfGas; 
        
        System.out.println("The cost of your trip is " +  moneyFormatter.format(costOfTrip) + ".");
                
                }
    
}
