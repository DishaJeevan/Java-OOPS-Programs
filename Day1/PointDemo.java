class point
{
     int x;// if dont mention ubic itis default but not public 
     int y;//if give private then error :y has private access in point
     //public void setX(int i) { // this is setter method(write only)
    public void setX(int x) {
         this.x = x;
     }
     public int getX() { // to read value of x
         return x;
     }
      //public void setY(int j) { // this is setter method(write only)
        public void setY(int y){
            this.y = y;
     }
     public int getY() { // to read value of x
         return y;
     }
}
public class pointdemo {
    public static void main(String[] args) {
        point p = new point();
        //p.x = 10;
        //p.y = 20;
        p.setX(10); // this is setter method
        p.setY(20); // this is setter method

        //System.out.println(" (" + p.x + ", " + p.y + ")");
        System.out.println(" (" + p.getX() + ", " + p.getY() + ")");
    } 
}
