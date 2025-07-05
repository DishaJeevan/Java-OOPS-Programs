class odd  extends Thread{
    int n;
    public void oddnumber(int n){
        this.n=n;
        this.start();

    }
    public void run(int n){
       
        System.out.println("Odd numbers from 1 to 100 are:" +n);
        
       
    }

}

class even extends Thread{
int n;
    public void evennumber(int n){
        this.n=n;
        this.start();
    }
    public void run(){
        System.out.println("Even numbers from 1 to 100 are:" +n);
    }
}

public class evenoddthread{
    public static  void main(String args[]){
        for(int i=0;i<100;i++){
             System.out.println( "Even number"+i);
            if(i%2==0){
               new even(i);
            } else {
               new odd(i);
            }
        }



    }


    }

