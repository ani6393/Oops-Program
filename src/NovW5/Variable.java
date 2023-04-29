package NovW5;
public class Variable
{
    static int a = 10; // Static variable
    int b = 20;// Instance variable

    public static void main(String[] args)
    {
        int c = 30; // Local variable
        {
            System.out.println(c);// Local
            System.out.println(a);//static
            System.out.println(Variable.a);
            Variable p1 = new Variable();
            System.out.println(p1.b);// instance
        }
    }
}
