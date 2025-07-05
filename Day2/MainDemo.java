import java.util.Scanner;
class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("Name:"+name+"\nAge:"+age);
    }
    }
class Student extends Person{
    int usn;
    int marks;
    Student(String name,int age,int usn,int marks){
        super(name,age);
        this.usn=usn;
        this.marks=marks;
    }
    public void display(){
        
        super.display();
        System.out.println("USN:"+usn+"\nMarks:"+marks);
    }
    
}
class Teacher extends Person{
    int id;
    float salary;
    Teacher(String name,int age,int id,float salary){
        super(name,age);
        this.id=id;
        this.salary=salary;
    }
    public void display(){
        
        super.display();
        System.out.println("ID:"+id+"\nSalary:"+salary);
    }
}
public class MainDemo {
    Student s;
    Teacher t;
    public void addStudent(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Student details:");
        System.out.println("Enter name:");
        String name=sc.nextLine();
        System.out.println("Enter age:");
        int age=sc.nextInt();
        System.out.println("Enter USN:");
        int usn=sc.nextInt();
        System.out.println("Enter marks:");
        int marks=sc.nextInt();
         s=new Student(name, age, usn, marks);
         sc.close();
    }
    public void displayStudent(){
        System.out.println("---------STUDENT INFO---------");
        s.display();
    }
    public void addTeacher(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Teacher details:");
        System.out.println("Enter name:");
        String name=sc.nextLine();
        System.out.println("Enter age:");
        int age=sc.nextInt();
        System.out.println("Enter Id:");
       int id=sc.nextInt();
        System.out.println("Enter Salary:");
        float salary=sc.nextFloat();
        t=new Teacher(name,age,id,salary);
        sc.close();
    }
    public void displayTeacher(){
      
        System.out.println("---------TEACHER INFO---------");
        t.display();
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        MainDemo demo = new MainDemo(); 
        demo.addStudent();
        demo.displayStudent();
        demo.addTeacher();
        demo.displayTeacher();
        sc.close();

    }
}
