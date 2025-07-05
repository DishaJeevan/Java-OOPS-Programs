class Shape{      //abstract class cannot be instantiated
   private double dim1,dim2;
   public double getdim1() {
        return dim1;
    }   
    public double getdim2() {
        return dim2;
    }  
    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    
    // Getters for dimensions
    
    public double findArea(){
        return 0; // Default implementation, can be overridden
    }
}
class Rectangle extends Shape{
    public Rectangle(double length,double breadth){
       super(length,breadth);
    }
    public double findArea(){
        return getdim1()*getdim2(); // Area of rectangle
    }
}
class Triangle extends Shape{
    public Triangle(double base,double height){
        super(base,height);
    }
    public double findArea(){
        return 0.5*getdim1() * getdim2();  // Area of triangle
    }
}
class Circle extends Shape{
    public Circle(double radius){
        super(radius,0); // Second dimension is not used for circle
    }
    public double findArea(){
        return 3.14 * getdim1() * getdim1(); // Area of circle
    }
}
public class ShapeDemo {
    public static void main(String[] args) {
        Shape s;
      s=new Rectangle(10,5);
        System.out.println("Area of Rectangle is:"+s.findArea());
       s=new Triangle(10,5);
        System.out.println("Area of Triangle is:"+s.findArea());
        s=new Circle(7);
        System.out.println("Area of Circle is:"+s.findArea());
        
    }
}
