class display extends Thread
{
    public display(){
        this.start();
    }
    // public void ontohunusingfor() {
    //     for(int i = 0; i < 10; i++) {
    //         System.out.println("using for loop:" +i+" ");

    //     }
    // }

    // static void onetohunusingwhile(){
    public void run() {
        int i=1;
        while(i<=100) {
            System.out.println("using while loop:" +i+" ");
            i++;
        }
    }
}
public class main {
    public static void main(String[] args) {
        display d = new display();
        //d.start();
        // main.ontohunusingfor();
        // main.onetohunusingwhile();
         for(int i = 0; i < 10; i++) {
         System.out.println("using for loop:" +i+" ");

     }
    }
}
