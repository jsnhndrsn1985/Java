
/**
 * Write a description of class Vehicle here.
 * 
 * @Jason Henderson 
 * @Chapter 7, Project 6
 */
public class Vehicle
{
  private String manufacturer;
  private int cylinders;
  private Person owner;
  
  //constructors
  
  public Vehicle()
  {
      manufacturer = "none";
      cylinders = 1;
      owner = null;
  }

  // constructor with parameters
  public Vehicle(String theManufacturer, int numCylinders,Person theOwner)
  {
      manufacturer = theManufacturer;
      cylinders = numCylinders;
      owner = new Person(theOwner);
  }
  
  // constructor with Vehicle class parameters
  public Vehicle(Vehicle other)
  {
      manufacturer = other.manufacturer;
      cylinders = other.cylinders;
      owner = new Person(other.owner);
  }
  
  //mutator method
  public void setManufacturer(String newManufacturer)
  {
      manufacturer = newManufacturer;
  }
  
  //set Cylinders
  public void setCylinders(int newNum)
  {
      cylinders = newNum;
  }
  
  //set owner
  public void setOwner(Person newOwner)
  {
      owner = new Person(newOwner);
  }
  
  //accessor methods
  public String getManufacturer()
  {
      return manufacturer;
  }
  
  public int getCylinders()
  {
      return cylinders;
  }    
  
  public Person getOwner()
  {
      return owner;
  }
  
  //toString
  public String toString()
  {
      return "Manufacturer: " + manufacturer + ", " + "Cylinders: " + cylinders + ", " + " Owned By: " + owner;
  }
  
  //equals method
  public boolean equals(Vehicle other)
  {
      return manufacturer.equals(other.manufacturer) && cylinders == other.cylinders;
  }    
  }
  