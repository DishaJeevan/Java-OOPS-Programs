import javax.swing.*;
import java.awt.event.*;
public class SwingDemo3 {
    public static void main(String[] args){
       JFrame frame = new JFrame("REGISTRATION FORM");
        frame.setSize(500, 700);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Name:");
        label1.setBounds(50, 50, 100, 30);
        frame.add(label1);
        
        JTextField textField = new JTextField("");
        textField.setBounds(150, 50, 230, 30);  
        frame.add(textField);

        JLabel label2 = new JLabel("Email:");
        label2.setBounds(50, 100, 100, 30);
        frame.add(label2);
        JTextField emailField = new JTextField("");
        emailField.setBounds(150, 100, 230, 30);    
        frame.add(emailField);
        JLabel label3 = new JLabel("Gender:");
        label3.setBounds(50, 150, 100, 30);
        frame.add(label3);

        JRadioButton maleRadio = new JRadioButton("Male");
        maleRadio.setBounds(150, 150, 100, 30);
         frame.add(maleRadio);
        JRadioButton femaleRadio = new JRadioButton("Female");
        femaleRadio.setBounds(290, 150, 100, 30);
         frame.add(femaleRadio);
            ButtonGroup genderGroup = new ButtonGroup();
            genderGroup.add(maleRadio);
            genderGroup.add(femaleRadio);
         JLabel lb2 = new   JLabel("Password:");
        lb2.setBounds(50, 200, 100, 30);
        frame.add(lb2);
         JPasswordField ps = new   JPasswordField("");
        ps.setBounds(150, 200, 230, 30);
        frame.add(ps);

        JCheckBox termsCheckBox = new JCheckBox("I agree to the terms");
        termsCheckBox.setBounds(150, 250, 250, 30);
        frame.add(termsCheckBox);

        JButton bn1 = new JButton("REGISTER");
         bn1.setBounds(150, 300, 100, 25);
         frame.add(bn1);
         JButton bn2 = new JButton("CANCEL");
         bn2.setBounds(270, 300, 100, 25);
         frame.add(bn2);

         JTextArea txtar=new JTextArea();
         txtar.setBounds(50,350,350,150);
         frame.add(txtar);
        
         bn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                   String name = textField.getText();
                     String email = emailField.getText();
                     String password = new String(ps.getPassword());
                     StringBuilder Sb = new StringBuilder();
                    Sb.append("NAME: "+name+"\nEmail: "+email+"\nPassword: "+password);
                 if(maleRadio.isSelected()){
                    Sb.append("Gender: MALE");
                    // JOptionPane.showMessageDialog(null,"male is selected");
                 }else{
                     //JOptionPane.showMessageDialog(null,"Female is selected");
                     Sb.append("\nGender: Female");
                 }
                 if(termsCheckBox.isSelected()){
                     Sb.append("\nTerms: Accepted");
                }else{
                   Sb.append("\nTerms: Not Accepted");
                }
                txtar.setText(Sb.toString());
               }
        });
         bn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                textField.setText("");
                emailField.setText("");
                ps.setText("");
                maleRadio.setSelected(false);
                femaleRadio.setSelected(false);
                termsCheckBox.setSelected(false);
                txtar.setText("");
            }
         });
         frame.setVisible(true);
    }
}
