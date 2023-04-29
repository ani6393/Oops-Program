package NovW3;
public class Oops1 {
    public void eat() {
        System.out.println("Dog is eating");

    }
    public void run(){
        System.out.println("cat is running fast ");
    }

    public static void main(String[] args) {
        System.out.println("1");
Oops1 a=new Oops1();
        a.eat();
        Oops1 cat=new Oops1();
        cat.run();
        Birds ani=new Birds();
        ani.ak();
        ani.avi();

    }
}
class Birds{
    public void ak(){
        System.out.println("the dog is running fast");
    }
    public void avi()
    {System.out.println("The dog is eating");
    }
}