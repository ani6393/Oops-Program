package NovW2;
class P1
{
    String name;
    int age;
    public void good(String n,int a){
      this.name=n;
      this. age=a;
    }
    void display()
    {
        System.out.println(name+" "+age);
    }
    public void run()
    {
        System.out.println("dog is running fast");
    }
}
class P2
{
    public static void main(String[]args)
    {
        System.out.println("the dag is small ");
        P1 kavi=new P1();
        kavi.good("shera",100);
       // kavi.display();
        kavi.run();
        P2 s=new P2();
        s.cat();
    }
    public void cat()
    {
        System.out.println("cat is very cute");
    }
}