public class Admin extends User {
    public Admin(String username) {
        super(username);
    }

    public void login() {
        System.out.println("Admin " + username + " logged in.");
    }
}
