//cse,ece,me,ce,name,rollno,branch,year

import javax.swing.*;
public class combo{
    public static void main(String[] args){
       JFrame frame=new  JFrame("Registeration");//this displays title of that appliaction 
       frame.setSize(1500,1100);
        frame.setLayout(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label1=new JLabel("Username");
        label1.setBounds(90,80,90,50);
        JTextField text1=new JTextField("");
        text1.setBounds(200, 90, 219, 30);
        JLabel label2=new JLabel("RollNo");
        label2.setBounds(90,130,90,50);
        JTextField text2=new JTextField("");
        text2.setBounds(200,140, 219, 30);
        JLabel label3=new JLabel("Branch");
        label3.setBounds(90,189,90,50);
        JComboBox combo1=new JComboBox();
        combo1.setBounds(200, 185, 219, 30);
        String[] branches = {"CSE", "ECE", "ME", "CE"};
        JLabel label4=new JLabel("Year");
        label4.setBounds(90,230,90,50);
        JComboBox combo2=new JComboBox();
        combo2.setBounds(200, 235, 219, 30);
        String[] branches1 = {"FIRST", "SECOND", "THIRD", "FOURTH"};

        JButton save=new JButton("Save");
        save.setBounds(200, 285, 100, 30);
        JButton reset=new JButton("Reset");
        reset.setBounds(315, 285, 100, 30);
        for (String branch : branches) {
            combo1.addItem(branch);
        }
        for (String year : branches1) {
            combo2.addItem(year);
        }
        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(combo1);
        frame.add(combo2);
        frame.add(save);
        frame.add(reset);
        frame.add(label3);
        frame.add(label4);
        frame.setVisible(true);
    }
}