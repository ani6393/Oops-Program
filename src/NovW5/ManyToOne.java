package NovW5;
class Student
{
            String name;
            String lastName;
            String MobileNo;
            Branch br;
            Student(String name1,String lastName1,String MobileNo1,Branch Br)
            {
            name=name1;
            lastName=lastName1;
            MobileNo=MobileNo1;
            br=Br;
            }
            void getstd()
        {
            System.out.println("Student Name: "+name);
            System.out.println("Student Last Name: "+lastName);
            System.out.println("Student Mobile Number: "+MobileNo);
            System.out.println("Bank Details......");
            System.out.println("Student Branch Code: "+br.branchCode);
            System.out.println("Student Branch Name: "+br.branchName);
            System.out.println("Location: "+br.location);
            System.out.println("===================================================");
        }
    }
           class Branch
{
           String branchCode;
           String branchName;
           String location;
          Branch(String branchCode1,String branchName1,String location1)
{
           branchCode=branchCode1;
           branchName=branchName1;
           location=location1;
}
}
           public class ManyToOne
{
    public static void main(String[] args)
    {
        Branch b=new Branch("Knp01","Panki","Kanpur");
        Student s=new Student("Alok","Kumar","8974548745",b);
        Student s1=new Student("Trilok","Kumar","897845465",b);
        Student s2=new Student("Anmesh","Kumar","8974548774",b);
        Student s3=new Student("Ali","Kumar","8977878545",b);
        Student s4=new Student("Anmol","Kumar","891242745",b);
        Student s5=new Student("Akhil","Kumar","89745999",b);
        Student s6=new Student("Abhi","Kumar","897444445",b);
        s.getstd();
        s1.getstd();
        s2.getstd();
        s3.getstd();
        s4.getstd();
        s5.getstd();
        s6.getstd();
        System.out.println();
        System.out.println("'PROGRAM IS CLOSED':)");
    }
}

