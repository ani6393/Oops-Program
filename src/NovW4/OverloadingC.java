package NovW4;
public class OverloadingC  //same method in one class, with different arguments; then run program;
{
       void an(int a,String c)
    {
        System.out.println("this is a car");
    }
      void an(String b)
   {
      System.out.println("this is bat");
}
public static void main(String[]args)
{
           OverloadingC av=new OverloadingC();
           av.an("ani");
   av.an(1,"b");
   c Abc=new c();
   Abc.ab();
}
}
class c
{
    void ab()
    {
        System.out.println("your name is Amit");
    }
}
