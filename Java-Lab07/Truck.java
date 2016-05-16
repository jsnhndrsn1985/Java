
/**
 * Write a description of class Truck here.
 * 
 * @Jason Henderson 
 * Chapter 7, Project 6
 */
public class Truck extends Vehicle
{
   private double loadCapacity;
   public int towCapacity;
   
   //constructor
   public Truck()
   {
       super();
       loadCapacity = 0;
       towCapacity = 0;
   }
   
   //Constructor with parameters
   public Truck(String manufacturer, int cylinders, Person owner, double theLoadCapacity, int theTowCapacity)
   {
       super(manufacturer, cylinders, owner);
       loadCapacity = theLoadCapacity;
       towCapacity = theTowCapacity;
   }
   
   //copy constructor
   public Truck(Truck other)
   {
       super(other);
       loadCapacity = other.loadCapacity;
       towCapacity = other.towCapacity;
   }    
   
   //set methods
   public void setLoadCapacity(double newLoadCapacity)
   {
       loadCapacity = newLoadCapacity;
   }
   
   public void setTowCapacity(int newTowCapacity)
   {
   towCapacity = newTowCapacity;    
   }    
    
   //accessor methods
   public double getLoadCapacity()
   {
       return loadCapacity;
   }   
   
   public int getTowCapacity()
   {
   return towCapacity;    
   }
   
   //toString
   public String toString()
   {
       return super.toString() + ", Load Capacity: " + loadCapacity + " tons, " + "Tow Capacity: " +
        towCapacity + " lbs.";
   }
   
   //equals
   public boolean equals(Truck other)
   {
   return super.equals(other) && loadCapacity == other.loadCapacity && towCapacity == other.towCapacity;    
   }
     
}
