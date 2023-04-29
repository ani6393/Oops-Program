package NovW4;
class B //Multiple_Level Inheritance Pattern;
{
    void b()
    {
        System.out.println("Method of A Class");
    }
}
class C extends B
{
    void c()
    {
        System.out.println("Method of B Class");
    }
}
public class Inheritance2 extends C
{
    void C()
    {
        System.out.println("Method of Inheritance2 Class");
    }
    public static void main(String[]args)
    {
      Inheritance2 reso=new Inheritance2();
      reso.b();
        System.out.println("++++++++++++++++");
      reso.c();
      reso.b();
      reso.C();
    }
}
