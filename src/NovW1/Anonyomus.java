package NovW1;
public class Anonyomus
{
    public static void main(String[]args)
    {
        Anonyomus.sum(new int[]{50,60,70,});
    }
static void sum(int[]no)
{
   int total=0;
    for (int i:no) {
            total = total + i;
System.out.println(total);
}
}
        }