import java.util.*;

class Student {
    int usn;
    String name;
    float marks;

    public Student(int usn, String name, float marks) {
        this.usn = usn;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println(usn + " " + name + " " + marks);
    }
}

public class ArrayListDemo {
    public static void main(String[] args) {
         //ArrayList<String> al = new ArrayList<String>();

        //al.add("Monday");
        //al.add("Tuesday");
         
         //Missing ArrayList declaration added here
         ArrayList<Student> al = new ArrayList<Student>();

         al.add(new Student(1, "Alice", 85.5f));
         al.add(new Student(2, "Bob", 90.0f));
         al.add(new Student(3, "Charlie", 78.0f));
         System.out.println("Size=: " + al.size());

         al.add(new Student(4, "MARK", 80.5f));
         al.add(new Student(5, "JOHN", 88.0f));
         System.out.println("Size=: " + al.size());

         Student temp = null;
         for (Student s : al) {
             if (s.usn == 2) {
                 temp = s;
                 break;
             }
             s.display();
         }

         al.remove(temp);
         System.out.println("Size=: " + al.size());

         for (Student s : al) {
             s.display();
         }

        //al.add("Wednesday");
        //al.add("Thursday");
        //System.out.println("Size=: " + al.size());

        //al.remove("Tuesday");
        //System.out.println("Size=: " + al.size());
        //for(String s:al){
        //   System.out.println(s);
        //}
    }
}
