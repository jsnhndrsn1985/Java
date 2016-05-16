
/**
 * Write a description of class Comedy here.
 * 
 * @author (Jason Henderson) 
 * @version (Project - Chapter 8)
 */
public class Comedy extends Movie
{
    public Comedy(String rating, int id, String title)
    {
        super(rating, id, title);
    }    
    
    //comedy late fee $2.50
    public double calcLateFees(int days)
    {
        return days * 2.5;
    }    
}
