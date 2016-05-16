
/**
 * Write a description of class Movie here.
 * 
 * @author (Jason Henderson) 
 * @version (Project # - Chapter 8)
 */
public class Movie
{
   private String rating;
   private int ID;
   private String title;
   
   //constructor
   
   public Movie(String theRating, int theId, String theTitle)
   {
       rating = theRating;
       ID = theId;
       title = theTitle;
   }
   
   //accessors
   public String getRating()
   {
       return rating;
   }
   
   public int getID()
   {
       return ID;
   }
   
   public String getTitle()
   {
       return title;
   }    
   
   //equals
   
   public boolean equals(Movie other)
   {
       if(other.getID() == ID)
       return true;
       return false;
   }
   
   //late fee. $2 per day.
   public double calcLateFees(int days)
   {
       return days * 2.00;
   } 
}
