package NovW5;
public class Employes1
{
    String name;
    String id;
    String salary;
    Address1 add;
     Employes1(String name1,String id1,String salary1,Address1 ad)
    {
        name = name1;
        id = id1;
        salary = salary1;
        add = ad;
    }
    void detail()
    {
        System.out.println("my name is-> "+name );
        System.out.println("Employee Id-> "+id);
        System.out.println("Employee Salary-> "+salary);
        System.out.println("Employee City-> "+add.city);
        System.out.println("State-> "+add.state);
        System.out.println("Pincode-> "+add.pincode);
        System.out.println("--------------------------------------------------------------");
    }
}
class Address1
{
    String city;
    String state;
    String pincode;
    Address1(String city1,String state1,String pincode1)
    {
        city=city1;
        state=state1;
        pincode=pincode1;
    }
}
class M
{
    public static void main(String[] args)
    {
        Address1 a1=new Address1("kanpur","up","11520");
        Employes1 e2=new Employes1("Abhi","01","2150000",a1);
        Employes1 e3=new Employes1("Anek","01","215000",a1);
        Employes1 e4=new Employes1("Anoop","01","2041000",a1);
        Employes1 e5=new Employes1("Anmol","01","2150000",a1);
        Employes1 e6=new Employes1("Asheesh","01","2150000",a1);
        Employes1 e7=new Employes1("Vishal","01","20457500",a1);

        System.out.println("PROGRAM IS CLOSED");
    }
}