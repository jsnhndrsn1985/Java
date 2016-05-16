
/**
 * Write a description of class StandardDeviation here.
 * 
 * @author (Jason Henderson) 
 * @version (Chapter 6 - Project 5 )
 */
public class StandardDeviation
{
   public static double standDev(double[] array, int size)
    {
      double avg = 0;
      
      
      for(int a = 0; a < size; a++)
        {
            avg += array[a];
        }
        
      avg = (avg / size);  
      
      double sum = 0;
      
      for(int b = 0; b < size; b++)
      {
          sum = (sum +(array[b] - avg) * (array[b] - avg));
      }
      
      //found math.sqrt on http://www.tutorialspoint.com/java/lang/math_sqrt.htm
      sum = Math.sqrt(sum / size);
      
      return sum;
      
    }
}
