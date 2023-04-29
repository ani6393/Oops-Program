package NovW4;
public class AutomaticPromotion  // This is Automatic promotion concept{String Vs Object(Parent class)}:
{
    void show(Object a)//Parent class;
    {
        System.out.println("object method");
    }
    void show(String a) //child class;
    {
        System.out.println("String method");
    }
    public static void main(String[]args)
    {
        AutomaticPromotion ab=new AutomaticPromotion();
        ab.show("a");//when you call by string ,first prefer to String value;
        ab.show('a');// when you this type object based value(this is not String value)
    }
}

//if same me method me object refrence ke throw (String value) se call karne par dono method me se String name ka methd hi
//call hoga, aur vo object ko (object is parent class of all java classes.)but get fitst String value if you call by String value:
