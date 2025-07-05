import javax.swing.*;

public class RegisterFrame extends JFrame {
    public RegisterFrame() {
        setTitle("Register");
        setSize(400, 300);
        setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 30, 100, 30);
        add(userLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(150, 30, 180, 30);
        add(usernameField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 80, 100, 30);
        add(passLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 80, 180, 30);
        add(passwordField);

        JLabel roleLabel = new JLabel("Role:");
        roleLabel.setBounds(50, 130, 100, 30);
        add(roleLabel);

        JComboBox<String> roleBox = new JComboBox<>(new String[]{"Admin", "Student"});
        roleBox.setBounds(150, 130, 180, 30);
        add(roleBox);

        JButton registerBtn = new JButton("Register");
        registerBtn.setBounds(150, 180, 100, 30);
        add(registerBtn);

        JButton backBtn = new JButton("Back");
        backBtn.setBounds(260, 180, 70, 30);
        add(backBtn);

        registerBtn.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            String role = (String) roleBox.getSelectedItem();

            if (UserStore.register(username, password, role)) {
                JOptionPane.showMessageDialog(this, "Registered successfully!");
                new LoginFrame();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Username already exists!");
            }
        });

        backBtn.addActionListener(e -> {
            new LoginFrame();
            dispose();
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }
}