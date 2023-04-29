package NovW3;
import java.util.Scanner;
public class P4
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter first numner");
        int no1=s.nextInt();
        System.out.println("Enter Second  number");
        int no2=s.nextInt();
        System.out.println("(+,-,*,/)");
        String sym=s.next();
        int res;
        switch (sym)
        {
            case "+":res=no1+no2;
                System.out.println("Addition is :"+res);
                break;
            case "-":res=no1-no2;
                System.out.println("Subtraction is :"+res);
                break;
            case "*":res=no1*no2;
                System.out.println("Multiplication is :"+res);
                break;
            case "/":res=no1/no2;
                System.out.println("Divide is :"+res);
                break;
            default:System.out.println("Invalid Symbol");
        }
    }
}
