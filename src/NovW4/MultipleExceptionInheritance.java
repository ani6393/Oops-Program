package NovW4;
public class MultipleExceptionInheritance
{
    void a()
    {
        try
        {
            int[] arr = {10, 20, 50, 30, 40, 70, 60};
                System.out.println(arr[7]);
            {
                System.out.println("My name is Aniket");
            }
        }
    catch (ArrayIndexOutOfBoundsException e)
    {
        System.out.println("this value not found in Array list:");
        System.out.println("My name is Aniket");
    }
    }
}
class Ap extends MultipleExceptionInheritance
{
        void b()
        {
            try{
            int no1, no2,c;
            no1=50; no2=5;
            c=no1/no2;

            {
                System.out.println(c);
                System.out.println("My name is Dinesh");
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println("can't divide by zero ");
        }
        }
    }
    class Ab extends Ap
    {
    }
class Main
{
    public static void main(String[] args)
    {
        Ab ab1 = new Ab();
        ab1.a();
        ab1.b();
    }
}
