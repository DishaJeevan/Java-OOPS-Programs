class DisplayNumbers {
    // static int i=1;
    public static void fun1() {
     for(int i = 1; i <= 10; i++) {
         System.out.println(i);
     }
    }
    public static void fun2(){
       int i=1;
        while(i<=10) {
            System.out.println(i);
            i++;
        }
    }
    public static void fun3(){
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
    public static void  fun4() {
      
       if( i<=10) {
           System.out.println(i);
           i++; 
         fun4();
           
    
    }
    }
}
public class DisplayNumbersDemo {
    public static void main(String[] args) {
        //DisplayNumbers dis = new DisplayNumbers();
        //DisplayNumbers.fun1(); 
       // DisplayNumbers.fun2(); 
        //DisplayNumbers.fun3();
        DisplayNumbers.fun4();   
        }
    }

