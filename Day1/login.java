import javax.swing.*;
public class login{
    public static void main(String[] args){
       JFrame frame=new  JFrame("Login");//this displays title of that appliaction 
       frame.setSize(1500,1100);
        frame.setLayout(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label1=new JLabel("Username");
        label1.setBounds(90,80,90,50);
        JTextField text1=new JTextField("");
        text1.setBounds(200, 90, 219, 30);
        JLabel label2=new JLabel("Password");
        label2.setBounds(90,130,90,50);
        JPasswordField pas=new JPasswordField("");
        pas.setBounds(200,140, 219, 30);
        JCheckBox check=new JCheckBox("Remeber Me");
        check.setBounds(200, 185, 120, 30);
        JButton button=new JButton("Login");
        button.setBounds(200, 230, 100, 30);
        JButton cancel=new JButton("Cancel");
        cancel.setBounds(315, 230, 100, 30);
      
        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(pas);
        frame.add(check);
        frame.add(button);
        frame.add(cancel);
        frame.setVisible(true);
    }
}