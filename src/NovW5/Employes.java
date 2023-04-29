package NovW5;
public class Employes
{
    String name;
    String id;
    int salary;
    Address add;
    void detail (String name1,String id1,int salary1,Address ad)
    {

        name = name1;
        id = id1;
        salary = salary1;
        add = ad;


        System.out.println("my name is= "+name + "; id= " + id + "; salary= " + salary + " " + "; city= " + add.city + "; State= " + add.state + "; Pincodr= " + add.pincode+" :;");
        System.out.println("==================================================================================");
    }
    }
class Address
{
    String city;
 String state;
 String pincode;
 Address(String city1,String state1,String pincode1)
 {
     city=city1;
     state=state1;
     pincode=pincode1;
 }
}
     class M0
{
      public static void main(String[] args)
      {
        Address a1=new Address("kanpur","up","11520");
        Employes e1=new Employes();
        e1.detail("jatin","01",1023150,a1);
        e1.detail("Jay","01",1023150,a1);
        e1.detail("Vijay","02",1123150,a1);
        e1.detail("Vikas","03",1023150,a1);
        e1.detail("jatin","04",1023150,a1);
        e1.detail("Veer","05",1023150,a1);
    }
}