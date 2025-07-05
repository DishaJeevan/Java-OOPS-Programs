class Parent{
    int x;
    
    Parent(int x){
        this.x=x;
    }
public void display(){
    System.out.println("X="+x);
}
}
class Child extends Parent{
    int y;
    Child(int x,int y){
        super(x);  // Parent class's constructor to initialize x
        this.y=y;
    }
    
public void display(){
 // super.display(); // Call Parent's display method
    System.out.println("X="+x+"y="+y);  // This will still refer to Parent's x
}
}
public class ParentChildDemo {
   public static void main(String[] args) {
    Child c=new Child(10,40);
   // c.x=80; // This will not affect Parent's x
   c.display();
    //Parent p=new Parent();
   // p.display();
   // p=new Child(); // create a Child object and assigning it to Parent reference
    //p.display(); // Calls Child's display method due to dynamic method dispatch
   } 
}
