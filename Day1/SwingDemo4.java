import javax.swing.*;
public class SwingDemo4 {
   public static void main(String[] args){
    JFrame frame = new JFrame("REGISTRATION FORM");
        frame.setSize(500, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lbl1 = new JLabel("Name:");  
        lbl1.setBounds(50, 50, 100, 30);
        frame.add(lbl1);
        JTextField txt1 = new JTextField("");
        txt1.setBounds(150, 50, 230, 30);
        frame.add(txt1);

        JLabel lbl2 = new JLabel("Roll No:");
        lbl2.setBounds(50, 100, 100, 30);
        frame.add(lbl2);
        JTextField txt2 = new JTextField("");
        txt2.setBounds(150, 100, 230, 30);
        frame.add(txt2);

        JLabel lbl3 = new JLabel("Email:");
        lbl3.setBounds(50, 150, 100, 30);
        frame.add(lbl3);
        String[] branch= {"MCA", "BCA", "BBA", "MBA", "B.Tech", "M.Tech"};
        JComboBox bx = new JComboBox(branch);
        bx.setBounds(150, 150, 230, 30);
       frame.add(bx);

        JLabel lbl4 = new JLabel("Year:");
        lbl4.setBounds(50, 200, 100, 30);
        frame.add(lbl4);
        String[] year= {"1st Year", "2nd Year", "3rd Year", "4th Year"};
        JComboBox yearCombo = new JComboBox(year);
        yearCombo.setBounds(150, 200, 230, 30);
        frame.add(yearCombo);

        JButton btn1 = new JButton("SAVE");
         btn1.setBounds(150, 280, 100, 25);
         frame.add(btn1);
         JButton btn2 = new JButton("RESET");
         btn2.setBounds(270, 280, 100, 25);
         frame.add(btn2);

        frame.setVisible(true);
   } 
}
