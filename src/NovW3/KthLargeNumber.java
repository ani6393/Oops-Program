package NovW3;
public class KthLargeNumber
{
    public static void main(String[]args)
    {
        int[] a={10,12,15,20,25,30,26};
        int k=4;
        //int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        if(i==k-1){
            System.out.println(k+" largest element is, "+a[i]+" .");
        }
        }
   for(int i=0;i<a.length;i++){
       System.out.print(a[i]+",");
   }
    }
}
