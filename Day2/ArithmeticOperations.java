import javax.swing.*;
import java.awt.event.*;
public class ArithmeticOperations {
    public static void main(String[] args){
        JFrame frame=new JFrame("Operations Application");
        frame.setSize(400,300);
        frame.setLayout(null); // No layout manager, absolute positioning
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lbl1=new JLabel("Operand 1:");
        lbl1.setBounds(50,50,200,30);
        frame.add(lbl1);

        JTextField txt1=new JTextField();
        txt1.setBounds(150,50,200,30);
        frame.add(txt1);


        JLabel lbl2=new JLabel("Operand 2:");
        lbl2.setBounds(50,100,200,30);
        frame.add(lbl2);

        JTextField txt2=new JTextField();
        txt2.setBounds(150,100,200,30);
        frame.add(txt2);

         JLabel lbl3=new JLabel("Output:");
        lbl3.setBounds(50,150,200,30);
        frame.add(lbl3);

        JTextField txt3=new JTextField();
        txt3.setBounds(150,150,200,30);
        frame.add(txt3);

        JButton btn1=new JButton("+");
        btn1.setBounds(50,200,50,30);
        frame.add(btn1);

        JButton btn2=new JButton("-");
        btn2.setBounds(130,200,50,30);
        frame.add(btn2);

        JButton btn3=new JButton("*");
        btn3.setBounds(220,200,50,30);
        frame.add(btn3);

        JButton btn4=new JButton("/");
        btn4.setBounds(300,200,50,30);
        frame.add(btn4);

        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int num1=Integer.parseInt(txt1.getText());
                int num2=Integer.parseInt(txt2.getText());
                int result=num1+num2;
                txt3.setText(String.valueOf(result));
                
            }
        });

        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int num1=Integer.parseInt(txt1.getText());
                int num2=Integer.parseInt(txt2.getText());
                int result=num1-num2;
                txt3.setText(String.valueOf(result));
                
            }
        });

        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int num1=Integer.parseInt(txt1.getText());
                int num2=Integer.parseInt(txt2.getText());
                int result=num1*num2;
                txt3.setText(String.valueOf(result));
                
            }
        });

        btn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int num1=Integer.parseInt(txt1.getText());
                int num2=Integer.parseInt(txt2.getText());
                int result=num1/num2;
                txt3.setText(String.valueOf(result));
                
            }
        });

        frame.setVisible(true);
    }
    
}
