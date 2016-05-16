
/**
 * Write a description of class Demo here.
 * 
 * @Jason Henderson 
 * @Chapter 7 project 6
 */
public class Demo
{
   public static void main(String args[])
   {
       
   Person owner1 = new Person("Jason Henderson");
   Person owner2 = new Person("Alysha Henderson");
   
   Vehicle aNewCar = new Vehicle("Hyundai", 5, owner2);
   Truck aNewTruck = new Truck();
   
   aNewTruck.setManufacturer("Nissan");
   aNewTruck.setCylinders(6);
   aNewTruck.setOwner(owner1);
   aNewTruck.setLoadCapacity(8);
   aNewTruck.setTowCapacity(2000);
   
   System.out.println(aNewTruck.getManufacturer());
   System.out.println(aNewTruck.getCylinders());
   System.out.println(aNewTruck.getOwner());
   System.out.println(aNewTruck.getLoadCapacity());
   System.out.println(aNewTruck.getTowCapacity());
   
   System.out.println("First Vehicle: ");
   System.out.println(aNewCar);
   System.out.println("Second Vehicle: ");
   System.out.println(aNewTruck);
   
}
} 
