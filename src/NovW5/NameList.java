package NovW5;
    public class NameList
{
    String name;
    int no;
    NameList (String name,int no)
    {
    this.name=name;
     this.no=no;
    }
    void o()
    {
        System.out.println("i am the best");
    }
}
    class OMain1
{
    String name1;
    int no1;
    OMain1(String name1,int no1)
    {
        this.name1=name1;
        this.no1=no1;
    }
    void p()
    {
        System.out.println("i am good");
    }
    public static void main(String[]args)
{
    NameList run=new NameList("Aniket",1);
    System.out.println("name "+run.name);
    System.out.println("Roll no: "+run.no);
    run.o();
    System.out.println("-----------------------------------------");
    NameList run1=new NameList("Rakesh",2);
    System.out.println("name "+run1.name);
    System.out.println("Roll no: "+run1.no);
    run.o();
    System.out.println("-----------------------------------------");
    NameList run2=new NameList("Mahesh",3);
    System.out.println("name "+run2.name);
    System.out.println("Roll no: "+run2.no);
    run.o();
    System.out.println("-----------------------------------------");
    NameList run3=new NameList("Dinesh",4);
    System.out.println("name "+run3.name);
    System.out.println("Roll no: "+run3.no);
    run.o();
    System.out.println("-----------------------------------------");
    NameList run4=new NameList("Manoj",5);
    System.out.println("name "+run4.name);
    System.out.println("Roll no: "+run4.no);
    run.o();
    System.out.println("=============================================================");
    OMain1 z=new OMain1("Ravi",6);
    System.out.println("name "+z.name1);
    System.out.println("Roll no: "+z.no1);
    z.p();
    System.out.println("------------------------------------------");
    OMain1 z1=new OMain1("Shiv",7);
    System.out.println("name "+z1.name1);
    System.out.println("Roll no: "+z1.no1);
    z.p();
    System.out.println("------------------------------------------");
    OMain1 z2=new OMain1("Shiva",8);
    System.out.println("name "+z2.name1);
    System.out.println("Roll no: "+z2.no1);
    z.p();
    System.out.println("------------------------------------------");
    OMain1 z3=new OMain1("Keshaw",9);
    System.out.println("name "+z3.name1);
    System.out.println("Roll no: "+z3.no1);
    z.p();
    System.out.println("------------------------------------------");
    OMain1 z4=new OMain1("Rohan",10);
    System.out.println("name "+z4.name1);
    System.out.println("Roll no: "+z4.no1);
    z.p();
    System.out.println("------------------------------------------");
    System.out.println();
    System.out.println("PROGRAM IS CLOSED");
}

}
