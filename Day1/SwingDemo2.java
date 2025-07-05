import javax.swing.*;
public class SwingDemo2 {
    public static void main(String[] args){
        JFrame frame = new JFrame("Login Page");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel button = new   JLabel("Username:");
        button.setBounds(50, 50, 100, 30);
        frame.add(button);
        JTextField tf = new   JTextField("");
        tf.setBounds(150, 50, 200, 30);
        frame.add(tf);
        JLabel lb2 = new   JLabel("Password:");
        lb2.setBounds(50, 100, 100, 30);
        frame.add(lb2);
         JPasswordField ps = new   JPasswordField("");
        ps.setBounds(150, 100, 200, 30);
        frame.add(ps);
        
        JCheckBox ch = new  JCheckBox("Remember Me");
         ch.setBounds(150, 135, 120, 30);
         frame.add(ch);
         JButton bn1 = new JButton("LOGIN");
         bn1.setBounds(150, 180, 80, 25);
         frame.add(bn1);
         JButton bn2 = new JButton("Cancel");
         bn2.setBounds(270, 180, 80, 25);
         frame.add(bn2);
        
        frame.setVisible(true);
    }
}
