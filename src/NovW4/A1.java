package NovW4;
 class A1
{
    A1()
    {

    }
   String name;
    int no;
    A1(String name,int no)
    {
        this.name=name;
        this.no=no;
    }

    void a()
    {
        System.out.println("Method of A1 Class");
        System.out.println("My name is Ravi");
    }
}
class B1 extends A1
{
    void b() {
        System.out.println("Method of B1 Class");
        System.out.println("My name is Kavi");
    }
}
class C1 extends A1
{
    void c()
    {
        System.out.println("Method of C1 class");
        System.out.println("My name is Shani");
    }
  public static void main(String[]args)
    {
        System.out.println("These all Class or Methods are availble");

        C1 c1=new C1();
        c1.c();
        c1.a();
       System.out.println("--------------------------");
        B1 b1=new B1();
        b1.a();
        b1.b();
        System.out.println("--------------------------");
        A1 a1=new A1("Aniket",1);
        a1.a();
        System.out.println(a1.name);
        System.out.println(a1.no);
    }
}