package NovW5;
public class OverRidding
{
    void a(int a,String b)
    {
        System.out.println("Are you ready ->");
    }
}
class OverRidding1 extends OverRidding
{
    void c(int a,String b)
    {
        System.out.println("I am ready (:");
    }

    public static void main(String[] args)
    {
        OverRidding1 ob1=new OverRidding1();
        ob1.a(10,"Ravi");
        ob1.c(2,"santosh");
    }
}