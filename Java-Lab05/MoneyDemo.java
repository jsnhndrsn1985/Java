
/**
 * Write a description of class MoneyDemo here.
 * 
 * @author (Jason Henderson) 
 * @version (Testing Money Class)
 */
public class MoneyDemo
{
    public static void main(String[] args)
    {
        //no argument
        Money moneyTest0 = new Money();
        System.out.println(moneyTest0.toString());
        
        //one argument
        Money oneArgumentMoney = new Money(8);
        System.out.println(oneArgumentMoney.toString());
        
        //two arguments
        Money twoArgumentMoney = new Money(16, 45);
        System.out.println(twoArgumentMoney.toString());
        
        //equals
        Money moneyTest1 = new Money (14, 35);
        Money moneyTest2 = new Money (10, 15);
        System.out.println(moneyTest1.equals(moneyTest2)? "They are Equal" : "They are not Equal");
        
        //addition
        Money addTest = Money.addition(moneyTest1, moneyTest2);
        System.out.println(addTest.toString());
        
        //subtraction
        Money subtractionTest = Money.subtraction(moneyTest1, moneyTest2);
        System.out.println(subtractionTest.toString());
        
        
    }
}
