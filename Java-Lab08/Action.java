
/**
 * Write a description of class Action here.
 * 
 * @author (Jason Henderson) 
 * @version (Project  - Chapter 8)
 */
public class Action extends Movie
{
    public Action(String rating, int id, String title)
    {
        super(rating, id, title);
    } 
    
    //late fee. $3 per day.
    public double calcLateFees(int days)
    {
        return days * 3.00;
    }
}
