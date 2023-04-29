package NovW3;
public class Constructor
{
    //Paramitrized Cunstructors, create by User.
    String name;
    int emp_id;
    Constructor(String name,int emp_id){
        this.name=name;
        this.emp_id=emp_id;
    }
    public static void main(String[] args)
    {
        Constructor p1=new Constructor("Aniket",100);
        Constructor p2=new Constructor("Vikas",101);
        System.out.println(p1.name+" "+p1.emp_id+":");
        System.out.println(p2.name+" "+p2.emp_id+":");
        }
    }
