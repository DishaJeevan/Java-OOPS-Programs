import java.util.Scanner;
class Calculator{
    double op1,op2;
public double add(){
        return op1 + op2;
    }
    public double subtract(){
        return op1 - op2;
    }
    public double multiply(){
        return op1 * op2;
    }
    public double divide(){
        if(op2 != 0) {
            return op1 / op2;
        } else {
            System.out.println("Cannot divide by zero");
            return 0;
        }
}
}
public class CalculatorDemo2 {
    public static void main(String [] args){
Calculator cal=new Calculator();
Scanner sc=new Scanner(System.in);
int choice;
do{
System.out.println("Menu:");
System.out.println("1. Add");
System.out.println("2. Subtract");
System.out.println("3. Multiply");
System.out.println("4. Divide");
System.out.print("Enter your choice: ");
choice=sc.nextInt();
System.out.print("Enter first number: ");
cal.op1 = sc.nextDouble();
System.out.print("Enter second number: ");
cal.op2 = sc.nextDouble();
double result;

switch(choice){
    case 1:result=cal.add();
    System.out.println("Result: " + result);
    break;
    case 2:result=cal.subtract();
    System.out.println("Result: " + result);
    break;
    case 3:result=cal.multiply();
    System.out.println("Result: " + result);
    break;
    case 4:result=cal.divide();
    System.out.println("Result: " + result);
    break;
    default:
        System.out.println("Invalid choice");
        break;
}
} while(choice!=5);
sc.close();
    }
}
