
/**
 * Write a description of class Person here.
 * 
 * @Jason Henderson 
 * @Chapter 7, Project 6.
 */
public class Person
{
  private String name;  
  
  //constructor
  public Person()
  {
      name = "none";
  }
  
  public Person(String theName)
  {
      name = theName;
  }    
  
  //constructor with person parameter
  public Person(Person theObject)
  {
      name = theObject.name;
  }
  
  //get method
  public String getName()
  {
      return name;
  }
  
  //set method
  public void setName(String theName)
  {
      name = theName;
  }
  
  //toString method
  public String toString()
  {
      return name;
  } 
  
  //equals method
  public boolean equals(Object other)
  {
      return name.equals(((Person)other).name);
  }
}
