package NovW4;
class DifferentNames              //we can create different name,age,color,size in one class with different menthod name; etc:
{
    String name;
    String color;
    String size;
    String age;
    void cat()
    {
        System.out.println("cat is running fast ;");
    }
    void dog()
    {
        System.out.println("the dog is killing anyone person ;");
    }
    public static void main(String[] args)
    {
        DifferentNames a=new DifferentNames();
        a.name="cat";
        a.age="10yr";
        a.color="white";
        a.size="small";
        a.cat();
        System.out.println(" name: "+a.name+"; age: "+a.age+" color: "+a.color+"; Size: "+a.size+";");
        System.out.println("-----------------------------------------------------------------");
        DifferentNames d=new DifferentNames();
        d.name=("dog");
        d.age="20yr";
        d.color="black";
        d.size="big";
        d.dog();
        System.out.println(" name: "+d.name+"; age: "+d.age+" color: "+d.color+"; Size: "+d.size+";");
        System.out.println();
        System.out.println("PROGRAM IS CLOSED");
    }
}

