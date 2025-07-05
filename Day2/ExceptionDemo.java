class A{
    public A(){
        try{
            System.out.println("Inside try block");
        }catch(Exception e){
            System.out.println("Inside catch block");
    }
    finally{
        System.out.println("Inside finally block");
    }
    System.out.println("Inside Last statement");
    }
}
class B{
    public B() throws Exception {
        try{
            System.out.println("Inside B try block");
            throw new Exception("Exception in B constructor");
            // int x=10,y=0;
            // int z=x/y;

        }catch(Exception e){
            System.out.println("Inside B catch block");
    }
    finally{
        System.out.println("Inside B finally block");
    }
    System.out.println("Inside B Last statement");
    }
}
class C{
    public C(){
        try{
            System.out.println("Inside C try block");
            return;
        }catch(Exception e){
            System.out.println("Inside C catch block");
    }
    finally{
        System.out.println("Inside C finally block");
    }
    System.out.println("Inside C Last statement");
    }
}
public class ExceptionDemo {
    public static void main(String[] args) {
        try{
       new B();
        }catch(Exception e){
        }
        }
    //     System.out.println("First statement");
    //     int x=20,y=0;
    //             try{
    //     int z=x/y;
    //   System.out.println("Result="+z);
    // }catch(ArithmeticException e){
    //     System.out.println(e);
    // }
    // finally{     //even if exception or return statement is there finally block will execute
    //      System.out.println("Last statement");
    // }
    //   System.out.println("Last statement");  //if return statement is there this statement will not execute
}

