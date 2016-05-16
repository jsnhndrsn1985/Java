
/**
 * Test for standard deviation.
 * 
 * @author (Jason Henderson) 
 * @version (Chapter 6 - Project 5)
 */
public class StandardDeviationTest
{
   public static void main(String args[])
    {
        double[] newArray = new double[20];
        
        newArray[0] = 25.4;
        newArray[1] = 14.7;
        newArray[2] = 21.0;
        newArray[3] = 22.0;
        newArray[4] = 35.1;
        newArray[5] = 15.7;
        newArray[6] = 12.6;
        newArray[7] = 7.5;
        newArray[8] = 16.3;
        newArray[9] = 10.5;
        
        int size = 10;
       
        System.out.println (StandardDeviation.standDev(newArray, size));
    }
}
