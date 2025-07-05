import javax.swing.*;
import java.awt.event.*;
public class Swing1 {
    public static void main(String[] args){
        JFrame frame=new JFrame("My First Swing Application");
        frame.setSize(500,400);
        frame.setLayout(null); // No layout manager, absolute positioning
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField txtInput=new JTextField();
        txtInput.setBounds(50,50,200,30);
        frame.add(txtInput);

        JButton btnSubmit=new JButton("Submit");
        btnSubmit.setBounds(50,100,200,30);
        frame.add(btnSubmit);

        JLabel lblOutput=new JLabel("Hello World");
        lblOutput.setBounds(50,150,200,30);
        frame.add(lblOutput);

        btnSubmit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                lblOutput.setText(txtInput.getText());
            }
        });
frame.setVisible(true);

        
    }
}
