
/**
 * Write a description of class InventoryItem here.
 * 
 * @author (Jason Henderson) 
 * @version (Chapter 13 - Project 2)
 */
public class InventoryItem implements Comparable
{
   private String name;
   private int uniqueItemID;
   
   public InventoryItem(String name, int id)
   {
       this.name = name;
       uniqueItemID = id;
   }
   
   public void setName(String newName)
   {
       name = newName;
   }
   
   public void setID(int newID)
   {
       uniqueItemID = newID;
   }
   
   public String getName()
   {
       return name;
   }
   
   public int getID()
   {
       return uniqueItemID;
   }    
   
   public int compareTo(Object other)
   {
        return uniqueItemID - ((InventoryItem)other).uniqueItemID;
   }
}
