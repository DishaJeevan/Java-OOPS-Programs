import javax.swing.*;
import java.awt.event.*;
class myframe extends JFrame{
    public myframe(){
        setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        // String[] columns={"USN","NAME","MARKS"};
        // String[][] data={{"101","A","90"},
        //                   {"102","B","80"},
        //                   {"103","C","70"}};
        // JTable table=new JTable(data,columns);
        // JScrollPane pane=new JScrollPane(table);
        // pane.setBounds(50,50,250,200);
        // this.add(pane);
        JMenuBar mb=new JMenuBar();
        JMenu file=new JMenu("File");
        JMenu edit=new JMenu("Edit");
        JMenuItem menusave=new JMenuItem("Save");
        JMenuItem menusaveas=new JMenuItem("SaveAs");
        JMenuItem menuundo=new JMenuItem("Undo");
        JMenuItem menuclose=new JMenuItem("Close");
        JMenuItem menuopen=new JMenuItem("Open");
        JMenuItem menucut=new JMenuItem("Cut");
        JMenuItem menucopy=new JMenuItem("Copy");
        JMenuItem menupaste=new JMenuItem("Paste");


        file.add(menusave);
        file.add(menusaveas);
        file.add(menuclose);
        file.add(menuopen);
        file.add(menuundo);
        edit.add(menucut);
        edit.add(menucopy);
        edit.add(menupaste);
       
        mb.add(file);
        mb.add(edit);
        this.setJMenuBar(mb);

        menuopen.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
               JOptionPane.showMessageDialog(null,"Open is clicked");
            }
        });

        menusave.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
               JOptionPane.showMessageDialog(null,"Save is clicked");
            }
        });

        menusaveas.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
              myframe frame = new myframe();
            }
        });

        menuclose.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
               JOptionPane.showMessageDialog(null,"Close is clicked");
            }
        });

        menuundo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
               JOptionPane.showMessageDialog(null,"Undo is clicked");
            }
        });



        this.setVisible(true);
    } 
}
public class Menu {
    public static void main(String[] args) {
        myframe frame = new myframe();
        
    }
}
