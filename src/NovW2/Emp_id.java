package NovW2;
public class Emp_id
{
    String name;
    int emp_id;
    Emp_id(String name,int a)

    {
        this. name=name;
       this. emp_id=a;
    }
    public static void main(String[] args)
    {
Emp_id e1=new Emp_id("Aniket",10);

        System.out.println("name:  "+e1.name+"."+" Emp_id:  "+e1.emp_id+".");
        System.out.println();
    }
}
