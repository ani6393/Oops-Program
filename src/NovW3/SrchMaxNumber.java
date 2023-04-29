package NovW3;
public class SrchMaxNumber
{
    public static void main(String[] args)
    {
        int[] a = {2, 5, 6, 7, 12, 32, 51, 25, 30, 10, 20, 90, 45, 35};
        int max = a[0];
        for (int i = 1; i < a.length; i++)
        {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max + ". This is max value in the list.");
    }
}
