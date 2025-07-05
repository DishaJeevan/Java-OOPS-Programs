import javax.swing.*;
import java.awt.event.*;
class Myframe extends JFrame{
    public Myframe(){
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        

        // JRadioButton rdomale=new JRadioButton("Male");
        // rdomale.setBounds(50,50,100,30);
        // add(rdomale);
        // JRadioButton rdofemale=new JRadioButton("Female");
        // rdofemale.setBounds(50,100,100,30);
        // add(rdofemale);
        // ButtonGroup bg=new ButtonGroup();
        // bg.add(rdomale);
        // bg.add(rdofemale);
        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        JComboBox bx=new JComboBox(days);
        bx.setBounds(50,250,100,40);
        add(bx);
        JButton btn=new JButton("Display");
        btn.setBounds(50,150,100,30);
        add(btn);

        JTextField txt=new JTextField();
        txt.setBounds(50,200,130,30);
        add(txt);

        // btn.addActionListener(new ActionListener(){
        //     public void actionPerformed(ActionEvent ae){
        //         if(rdomale.isSelected()){
        //            // txt.setText("Male is selected");
        //             JOptionPane.showMessageDialog(null,"male is selected");
        //         }else{
        //             JOptionPane.showMessageDialog(null,"Female is selected");
        //             //txt.setText("Female  is selected");
        //         }
        //         }
        // });

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                // String day=days[bx.getSelectedIndex()];
                // txt.setText(day);
                String day=bx.getSelectedItem().toString();
                txt.setText(day);
                }
        });

        this.setVisible(true);
    }
}
public class SwingDemo {
    public static void main(String[] args){
        // JFrame frame=new JFrame("My First Swing Application");
        // frame.setSize(400,400);
        // frame.setLayout(null); // No layout manager, absolute positioning
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // frame.setVisible(true);
        Myframe myFrame = new Myframe();
    }
}
