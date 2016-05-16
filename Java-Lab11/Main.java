
/**
 * Write a description of class Main here.
 * 
 * @author (Jason Henderson) 
 * @version (Chapter 13 - Project # 2)
 */
public class Main
{
   public static void sort(Comparable[] arr)
   {
       for (int outer = arr.length - 1; outer > 0; outer--)
       {
           for(int inner = 0; inner < outer; inner++)
           {
               if(arr[inner].compareTo(arr[inner + 1]) > 0)
                    {
                            Comparable temp = arr[inner];
                            arr[inner] = arr[inner + 1];
                            arr[inner + 1] = temp;
                     }//end if
           }//end second for        
       }// end first for    
}
public static void main(String args[])
    {
        InventoryItem[] items = 
        {
            new InventoryItem("Nuts ", 6568),
            new InventoryItem("Bolts ",  2354),
            new InventoryItem("Screws ", 1345),
        };
        System.out.println("Before Sorting: ");
        for (int i = 0; i < items.length; i++)
        System.out.println(items[i].getName()+ "" + items[i].getID());
        System.out.println();
        sort(items);
        System.out.println("After Sorting: ");
        for (int i = 0; i < items.length; i++)
        System.out.println(items[i].getName() + "" + items[i].getID());
        System.out.println();
    }
    }