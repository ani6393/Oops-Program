package NovW1;
public class Array3
{
    public static void main(String[] args)
    {
        int[][] a = {{105, 110, 120,}, {100, 200, 300, 50},{500,40,80,70},{55,77,40,50,1235}};
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j]+", ");
            }
      System.out.println();
        }
    }
}