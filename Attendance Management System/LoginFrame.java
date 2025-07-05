import javax.swing.*;

public class LoginFrame extends JFrame {
    JTextField usernameField;
    JPasswordField passwordField;
    JComboBox<String> roleBox;

    public LoginFrame() {
        setTitle("Login - Attendance Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLayout(null);

        JLabel roleLabel = new JLabel("Select Role:");
        roleLabel.setBounds(50, 20, 100, 30);
        add(roleLabel);

        roleBox = new JComboBox<>(new String[]{"Admin", "Student"});
        roleBox.setBounds(150, 20, 180, 30);
        add(roleBox);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 70, 100, 30);
        add(userLabel);

        usernameField = new JTextField();
        usernameField.setBounds(150, 70, 180, 30);
        add(usernameField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 110, 100, 30);
        add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 110, 180, 30);
        add(passwordField);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(150, 160, 100, 30);
        add(loginBtn);

        JButton registerBtn = new JButton("Register");
        registerBtn.setBounds(260, 160, 100, 30);
        add(registerBtn);

        loginBtn.addActionListener(e -> login());
        registerBtn.addActionListener(e -> {
            new RegisterFrame();
            dispose();
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void login() {
        String user = usernameField.getText();
        String pass = new String(passwordField.getPassword());
        String role = (String) roleBox.getSelectedItem();

        String[] userInfo = UserStore.login(user, pass);

        if (userInfo != null && userInfo[1].equals(role)) {
            if (role.equals("Admin")) {
                new Dashboard(new Admin(user));
            } else {
                new Dashboard(new Student(user));
            }
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid credentials!");
        }
    }
}