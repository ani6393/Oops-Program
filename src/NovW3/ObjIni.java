package NovW3;
public class ObjIni
{
    String color;
    int age;
    void run(String c,int a)
    {
       color=c;
       age=a;
}
void display(){
        System.out.println(color+" "+age);
}
public static void main(String[]args)
{
    System.out.println();
    ObjIni ani=new ObjIni();
   ani.run("black",100);
    ani.display();
}
}