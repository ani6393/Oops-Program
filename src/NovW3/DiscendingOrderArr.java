package NovW3;
public class DiscendingOrderArr
{
    public static void main(String[]args)
    {
        int []arr={10,5,4,8,9,7,6,11,15};
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
             if(arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
             }
            }
        }
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+",");
        }
        System.out.println();
        System.out.println("Second largest number is, "+arr[1]+".");
    }
}
