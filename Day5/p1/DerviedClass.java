package p1;

public class DerivedClass extends BaseClass {
    DerivedClass(){
        System.out.println("Hello from Derived Class");
         System.out.println("Default:"+n1);
        //System.out.println("Private:"+n2);  //private variables cannot be accessed within child class
        System.out.println("Protected:"+n3);
        System.out.println("Public:"+n4);
    }
    
}
