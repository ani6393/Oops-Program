package NovW5;
public class ManyToMany
{
    String stdName;
    String rollNo;
    String Section;
    course []crs;
    ManyToMany(String stdNamet1,String rollNo1,String section1,course[] courses1)
    {
     stdName= stdNamet1;
     rollNo=rollNo1;
     Section=section1;
     crs=courses1;
    }
    void stddetails()
    {
        System.out.println("Student Name: "+stdName);
        System.out.println("Roll Number: "+rollNo);
        System.out.println("Section Name: "+Section);
        System.out.println("Student Courses details");
       for(int i=0;i<crs.length;i++)
        {
            System.out.println("course "+(i+1)+":"+crs[i].courses);
        }
        System.out.println("===================================================");

    }
}
class course
{
 String schoolName;
 String courses;
 course(String courses1)
 {
 // schoolName=schoolName1;
  courses=courses1;
 }
}
class OneToMany
{
    public static void main(String[] args)
    {
        course c1=new course("java");
        course c2=new course("Python");
        course c3=new course("C");
        course c4=new course("C++");
        course[] courses0={c1,c2,c3,c4};
        ManyToMany s1=new ManyToMany("Aniket","01","A", courses0);
        s1.stddetails();
        course c5=new course("java");
        course c6=new course("Python");
        course c7=new course("C");
        course c8=new course("C++");
        course[] courses1={c1,c2,c3,c4};
        ManyToMany s2=new ManyToMany("Anuj","02","B", courses1);
        s2.stddetails();
        course c9=new course("java");
        course c10=new course("Python");
        course c11=new course("C");
        course c12=new course("C++");
        course[] courses2={c1,c2,c3,c4};
        ManyToMany s3=new ManyToMany("Anoop","03","C", courses2);
        s3.stddetails();
        System.out.println("PROGRAM IS CLOSED");
    }
}