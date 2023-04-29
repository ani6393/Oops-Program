package NovW4;
public class Inheritance
    //this is Parrent Class(super classs )       __________(parrents class ki property ko child class me acces
        //                                                                           karne ko inhertance kahte hai.)
{
    void eat()
    {
        System.out.println("Dog is eating.");
        System.out.println("Cat is running.");
        System.out.println("Lion is roaring.");
    }
}
class Dog extends Inheritance
   // this is child class{sub class} (dog {is-a} animal(Inheritance)class)
{
    public static void main(String[] args)
    {
    Dog d=new Dog();
    d.eat();
}
}
