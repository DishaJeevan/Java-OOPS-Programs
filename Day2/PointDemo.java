class Point{
   private int x;
    private int y;
    Point(){ // Default constructor ,System will call this constructor  even if we not specified it without body 
        this.x=1;
        this.y=1;
    }
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void Display(){
        System.out.println("Point:("+x+","+y+")");
    }
  public  String toString(){
        return "("+x+","+y+")";
    }
    public void move(int dx,int dy){    
        this.x += dx;
        this.y += dy;
    }
    public Point add(Point p){
        Point point=new Point();
        point.x=this.x+p.x;
        point.y=this.y+p.y;
        return point;
    }
}
public class PointDemo {
    public static void main(String[] args){
Point p1=new Point(10,20);
//Point p2=new Point();
Point p2=new Point(30,40);

//p1.x=10;
//p1.y=40;
p1.Display();
//p1.move(5,5);
p2.Display();
Point p3=p1.add(p2);
p3.Display();
//p2.Display();
//System.out.println(p1);
    }
}
