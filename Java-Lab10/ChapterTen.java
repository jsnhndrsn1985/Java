
/** 
 * @author (Jason Henderson) 
 * @version (Chapter 10 - Project 2)
 */
import java.util.*;
import java.io.*;

public class ChapterTen
{
   public static void main(String args[])
   {
       Scanner readFile = null;
       
       try
       {
           readFile = new Scanner(new FileInputStream("numbers.txt"));
       }
       
       catch(FileNotFoundException e)
       {
           System.out.println("Sorry, this file could not be found");
       }
       
       int max = readFile.nextInt();
       int min = max;
       while(readFile.hasNextInt())
       {
           int next = readFile.nextInt();
           
           if(min > next)
           min = next;
           
           if(max < next)
           max = next;
       }
       
       System.out.println("Maximum number: " + max);
       System.out.println("Minimum number: " + min);
    }
}
