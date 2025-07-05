public class Student extends User {
    public Student(String username) {
        super(username);
    }

    public void login() {
        System.out.println("Student " + username + " logged in.");
    }
}
