package p1;

public class OtherClass {
    public OtherClass(){
       p1. BaseClass b=new p1.BaseClass();
         System.out.println("Hello From Other class");
        System.out.println("Default:"+b.n1);  //Cannot access it is not a child class of BaseClass if we dont put b.n1
        // error: n2 has private access in BaseClass
        // System.out.println("Private:"+b.n2);
        System.out.println("Protected:"+b.n3);
        System.out.println("Public:"+b.n4);
    }
}
