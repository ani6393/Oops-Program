package NovW4;
class D                              //Heiratchial Inharitance pattern;
{
    void d()
    {
        System.out.println("Method of D Class");
    }
}
class E extends D
{
    void e()
    {
        System.out.println("Method of E Class");
    }
}
 class Inheritance3  extends D
{
    void F()
    {
        System.out.println("Method of Inheritance3 Class");
    }
    public static void main(String[]args)
    {
        Inheritance3 reso=new Inheritance3();
        reso.F();
        reso.d();
        System.out.println("++++++++++++++++");
        D ji=new D();
        ji.d();
        System.out.println("++++++++++++++++");
        E ed=new E();
        ed.d();
        ed.e();
    }
}



