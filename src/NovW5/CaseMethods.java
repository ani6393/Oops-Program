//                                CASE :- 1 VOID METHOD
//package NovW5; // case of overriding method with parent class and child class use differernt return type method;
//public class CaseMethods // this is parrent class and without void method use;
//{
//    Object a()
//{
//    System.out.println("AAAAAA");
//    return null;
//}
//}
//class B extends CaseMethods // this child class and this is also without return type method (void);
//{
//    String a()
//    {
//        System.out.println("BBBBBB");
//        return null;
//    }
//
//    public static void main(String[] args)
//    {
//        CaseMethods a1=new CaseMethods();
//     a1.a();
//     B b1=new B();
//     b1.a();
//        System.out.println("================================================================");
//    }
//}
//
//                                     CASE :-2 ACCESS MPODIFIER
//                              package NovW5;
//class AccessModifier
//{
//   public void a() //same access modifier use in parrent class and child class:
//    {
//        System.out.println("1111");
//    }
//}
//class C extends AccessModifier {
//    public void a () //if not same access modifeir use, then use big access modifier in child class from parrent class;
//    {
//        System.out.println("2222");
//    }
//
//    public static void main(String[] args) {
//        AccessModifier a1 = new AccessModifier();
//        a1.a();
//        C b1 = new C();
//        b1.a();
//
//        System.out.println();
//        System.out.println("PROGRAM IS CLOSED");
// System.out.println("======================================================") ;
//    }
//}
//
//                                  case:-3 Overriding and abstract method;
//package NovW5;
//                                abstract class A
//                                {
//                                    abstract void display();
//                                    void a()
//                                    {
//                                        System.out.println("1111");
//                                    }
//                                }
//                                class C extends A
//                                {
//                                    @Override
//                                    void display()
//                                    {
//                                        System.out.println("Aniket");
//                                    }
//                                   void a()
//                                    {
//                                      System.out.println("2222");
//                                    }
//                                    public static void main(String[] args)
//                                    {
//                                 // abstract a1 = new abstract(); //(no need to create object of abstract class;)
//                                   // a1.a();// (no need to create call method of abstract class;)
//                                        C b1 = new C();
//                                        b1.a();
//                                        System.out.println();
//                                        System.out.println("PROGRAM IS CLOSED");
//                                        System.out.println("==========================================");
//                                    }
//                                }
//
//                                          case:-4 use super keyword in class;
//package NovW5;
//        class Super1
//{
//        void show()
//    {
//        System.out.println("1111");
//    }
//}
//        class C extends Super1
//{
//         void show()
//    {
//        super.show();      //no need to create an object of parent class in child class if you use super keyword method in child class ;
//        System.out.println("2222");
//    }
//         public static void main(String[] args)
//    {
//        C b1 = new C();
//        b1.show();
//
//        System.out.println();
//        System.out.println("PROGRAM IS CLOSED");
//        System.out.println("======================================================") ;
//    }
//}