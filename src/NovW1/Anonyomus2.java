package NovW1;
public class Anonyomus2
{
    public static void main(String[]args)
    {
        Anonyomus2.sum(new int[][]{{100,500,600},{700,800,600}});
    }
static void sum(int[][] no)
{
        int total=0;
        for(int ii[]:no)
        {
            for(int i:ii)
            {
                total=total+i;
            }
        System.out.println("sum is : "+total);
        }
}
}

