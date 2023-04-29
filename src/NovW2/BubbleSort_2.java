package NovW2;
public class BubbleSort_2 {
    public static void main(String[]args){
        int temp;
        int[] a = {36, 19, 12, 29, 39};
     int flag=0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1- i; j++)
            {
         if(a[i]>a[j+1])
         {
             temp=a[j];
             a[j]=a[j+1];
             a[j+1]=temp;
             flag=1;
         }
            }
        if(flag==0){
            break;
        }
        }
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]);
    }
    }
}