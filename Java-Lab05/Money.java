
/**
 * Write a description of class Money here.
 * 
 * @author (Jason Henderson) 
 * @version (Chapter 5 - Project 5)
 */
public class Money
{
    
    private int dollars;
    private int cents;
    
    //No argument
    public Money()
    {
        dollars = 0;
        cents = 0;
    }
    
    //one argument set dollars
    public Money(int dollars)
    {
        this.dollars = dollars;
        this.cents = 0;
    }
    
    //Two argument constructor to set dollars & cents
    public Money(int dollars, int cents)
    {
        this.dollars = dollars;
        this.cents = cents;
    }
    
    //Mutator dollars 
    public void setDollars(int dollars)
    {
        this.dollars = dollars;
    }
    
    //Mutator cents
    public void setCents(int cents)
    {
        this.cents = cents;
    }
    
    //Accessor dollars
    public int getDollars()
    {
        return dollars;
    }
    
    //Accessor cents
    public int getCents()
    {
        return cents;
    }
    
    //addition - Dollars & Cents
    public static Money addition(Money money1, Money money2)
    {
        int newDollars = money1.getDollars() + money2.getDollars();
        int newCents = money1.getCents() + money2.getCents();
            return new Money(newDollars, newCents);
    }
    
    //subtraction - Dollars & Cents
    public static Money subtraction(Money money1, Money money2)
    {
        int newDollars = money1.getDollars() - money2.getDollars();
        int newCents = money1.getCents() - money2.getCents();
            return new Money(newDollars, newCents);
    }
    
    //equals
    public boolean equals(Money other)
    {
        return dollars == other.getDollars() && cents == other.getCents();
    }
    
    //toString for Print
    public String toString()
    {
        return "\nDollars : " + getDollars() + "\nCents : " + getCents();
    }
    
}
