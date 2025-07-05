class Calculator{

     public static void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void add(int a, int b,int c) {
        System.out.println("Sum: " + (a + b+c));
    }

    public static void add(double a, double b) {
        System.out.println("Sum: " + (a + b));
    } 
}
class CalculatorDemo {
    public static void main(String[] args) {
       
        Calculator.add(5, 3);
       Calculator.add(6,8,9);
      Calculator.add(7.9,6.0);
    
    }
}