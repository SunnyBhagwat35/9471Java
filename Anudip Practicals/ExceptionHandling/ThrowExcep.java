package axceptionHandling;

public class ThrowExcep
{
    static void fun()
    {
        try
        {
        	int a = 1;
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside fun().");
            throw e; 
        }
    }
 
    public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught in main.");
        }
        System.out.println("In Main");
    }
}
