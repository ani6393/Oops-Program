package NovW3;
//import java.util.Scanner;
public class BinarySearch
{
    public static void main(String[] args) {
        int []a={1,2,3,4,6,7,8,9,10,15,17,19,20,25};
        //Scanner s=new Scanner(System.in);
      //  System.out.println("1,2,3,4,6,7,8,9,10,15,17,19,20,25");
       // System.out.println("Select a number in given list.");
     //   int number=s.nextInt();
    //    int no=number;
        int Search=10;
        int li=0;
        int hi=a.length-1;
      int mi=(li+ hi)/2;
      while (li<=hi)
      {
          if(a[mi]==Search)
          {
              System.out.println(Search+". number is "+mi+", in index position.");
              break;
          }
          else if (a[mi]<Search)
          {
              li=mi+1;
          }
          else
          {
          hi=mi-1;
          }
      mi=(li+hi)/2;
      }


    if(li>hi)
    {
        System.out.println("Value not found in this list");

    }
    }
}
