package NovW4;
public class Inheritance1  //Single Inheritance Pattern;
{
    void avi()
    {
        System.out.println("Method of Inheritance Class.");
    }
}
class A extends Inheritance1
{
    public static void main(String[]args)
    {
        A ravi=new A();
        ravi.avi();
    }
}
