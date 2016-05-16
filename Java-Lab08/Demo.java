
/**
 * Write a description of class Demo here.
 * 
 * @author (Jason Henderson) 
 * @version (Project  - Chapter 8)
 */
public class Demo
{
    //test arrays
    public static void main(String args[])
    {
        Movie movies[] = new Movie[3];
        
        movies[0] = new Action("R", 1, "Mad Max");
        movies[1] = new Drama("R", 2, "Steve Jobs");
        movies[2] = new Comedy("R", 2, "Trainwreck");
        
        //print ratings
        
        for(int h = 0; h < movies.length; h++)
        System.out.println("Movie: " + movies[h].getTitle() + " -- Rating: " + movies[h].getRating());
        System.out.println();
        
        
        //late fees
        for(int k = 0; k < movies.length; k++)
        System.out.println("Movie: " + movies[k].getTitle() + " -- One Day Late Fee: $" + movies[k].calcLateFees(1));
        System.out.println();
        
        //ID are equal
        for (int i = 0; i < movies.length; i++)
        {
          for(int j = 0; j < movies.length; j++)
          {
              if(i != j && i>j)
                {
                    if(movies[i].equals(movies[j]))
                    System.out.println(movies[i].getTitle() + " has same movie ID as " + movies[j].getTitle());
                }  
          }     
        }   
        System.out.println();
    }    
}
