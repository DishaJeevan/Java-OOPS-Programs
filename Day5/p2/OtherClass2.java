package p2;

public class OtherClass2 {
    public OtherClass2(){
    p1. BaseClass b=new p1.BaseClass();
         System.out.println("Hello From Other class 2");
        // System.out.println("Default:"+b.n1);  
        // System.out.println("Private:"+b.n2);
        // System.out.println("Protected:"+b.n3);
        System.out.println("Public:"+b.n4); //can access only public 
    }
}

