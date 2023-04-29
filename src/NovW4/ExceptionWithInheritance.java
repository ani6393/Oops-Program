package NovW4;
public class ExceptionWithInheritance
{
    public static void main(String[] args)
    {
        int a=10,b=0,c;
        try
        {
            c = a/b;
            System.out.println(c);
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println("can't divide by zero");
        }
        System.out.println("main method ended");
    }
}
