import javax.swing.*;
public class register{
    public static void main(String[] args){
       JFrame frame=new  JFrame("Registeration");//this displays title of that appliaction 
       frame.setSize(1500,1100);
        frame.setLayout(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label1=new JLabel("Username");
        label1.setBounds(90,80,90,50);
        JTextField text1=new JTextField("");
        text1.setBounds(200, 90, 219, 30);
        JLabel label2=new JLabel("Email");
        label2.setBounds(90,130,90,50);
        JTextField text2=new JTextField("");
        text2.setBounds(200,140, 219, 30);
        JLabel label3=new JLabel("Gender");
        label3.setBounds(90,176,90,50);
        JRadioButton radio1=new JRadioButton("Male");
        radio1.setBounds(200, 185, 100, 30);
         JRadioButton radio2=new JRadioButton("Female");
        radio2.setBounds(300, 185, 100, 30);
        JLabel label4=new JLabel("Password");
        label4.setBounds(90,216,90,50);
        JPasswordField pas=new JPasswordField("");
        pas.setBounds(200,228, 219, 30);
        JCheckBox check=new JCheckBox("I accept the term and conditions");
        check.setBounds(200, 265, 250, 30);
        JButton button=new JButton("Register");
        button.setBounds(200, 308, 100, 30);
        JButton cancel=new JButton("Cancel");
        cancel.setBounds(315, 308, 100, 30);

        
      
        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(check);
        frame.add(label3);
        frame.add(radio1);
        frame.add(radio2);
        frame.add(button);
        frame.add(label4);
        frame.add(pas);
        frame.add(cancel);
        frame.setVisible(true);
    }
}