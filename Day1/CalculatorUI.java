import javax.swing.*;
import java.awt.event.*;
public class CalculatorUI {
    public static void main(String[] args){

        JFrame frame=new  JFrame("Calculator");
        frame.setSize(1500,1100);
        frame.setLayout(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField text1=new JTextField();
        text1.setBounds(20, 30, 232, 35);
        JButton button1 = new JButton("1");
        button1.setBounds(20, 80, 50, 40);
        JButton button2 = new JButton("2");
        button2.setBounds(80, 80, 50, 40);
        JButton button3 = new JButton("3");
        button3.setBounds(140, 80, 50, 40);
        JButton button4 = new JButton("4");
        button4.setBounds(20, 130, 50, 40);
        JButton button5 = new JButton("5");
        button5.setBounds(80, 130, 50, 40);
        JButton button6 = new JButton("6");
        button6.setBounds(140, 130, 50, 40);
        JButton button7 = new JButton("7");
        button7.setBounds(20, 180, 50, 40);
        JButton button8 = new JButton("8");
        button8.setBounds(80, 180, 50, 40);
        JButton button9 = new JButton("9");
        button9.setBounds(140, 180, 50, 40);
        JButton button0 = new JButton("0");
        button0.setBounds(80, 230, 50, 40);
        JButton add = new JButton("+");
        add.setBounds(200, 80, 50, 40);
        JButton sub = new JButton("-");
        sub.setBounds(200, 130, 50, 40);
        JButton mul = new JButton("*");
        mul.setBounds(200, 180, 50, 40);
        JButton div = new JButton("/");
        div.setBounds(200, 230, 50, 40);
        JButton equal = new JButton("=");
        equal.setBounds(140, 230, 50, 40);
        JButton clear = new JButton("C");
        clear.setBounds(20, 230, 50, 40);

        frame.add(text1);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button0);
        frame.add(add);
        frame.add(sub);
        frame.add(mul);
        frame.add(div);
        frame.add(equal);
        frame.add(clear);

        frame.setVisible(true);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "1");
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "2");
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "3");
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "4");
            }
        });

        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "5");
            }
        });

        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "6");
            }
        });

        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "7");
            }
        });

        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "8");
            }
        });

        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "9");
            }
        });

        button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "0");
            }
        });

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "+");
            }
        });

        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "-");
            }
        });

        mul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "*");
            }
        });

        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "/");
            }
        });

    equal.addActionListener(e -> {
    String expr = text1.getText().trim();
    if (expr.isEmpty()) {
        text1.setText("");
        return;
    }

    String[] ops = {"+", "-", "*", "/"};
    for (String op : ops) {
        int idx = expr.indexOf(op);
        if (idx > 0) {
            try {
                double a = Double.parseDouble(expr.substring(0, idx));
                double b = Double.parseDouble(expr.substring(idx + 1));
                double r = switch (op) {
                    case "+" -> a + b;
                    case "-" -> a - b;
                    case "*" -> a * b;
                    case "/" -> (b == 0) ? Double.NaN : a / b;
                    default -> 0;
                };
                text1.setText(Double.isNaN(r) ? "Error" : String.valueOf(r));
            } catch (Exception ex) {
                text1.setText("Error");
            }
            return;
        }
    }
    text1.setText("Error");
});


        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText("");
            }
        });


    }
}