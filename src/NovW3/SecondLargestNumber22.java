package NovW3;
public class SecondLargestNumber22
{
    public static void main(String[]args)
    {
        int []a={10,4,5,6,11,20,15,16};
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>largest)
            {
                second_largest=largest;
                largest=a[i];
            }
        else if (a[i]>second_largest && a[i]!=largest)

        {second_largest=a[i];
            }
        }
        if(second_largest==Integer.MIN_VALUE)
        {
            System.out.println("There is no Second largest elementin the list");
        }
        else
        {
            System.out.println("Seconod largest value is, "+second_largest+".");
        }
    }
}
