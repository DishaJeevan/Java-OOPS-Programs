import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {
    User user;

    public Dashboard(User user) {
        this.user = user;
        setTitle("Dashboard - " + user.getUsername());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLayout(new BorderLayout());

        AttendancePanel panel = new AttendancePanel(user);
        add(panel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        JButton saveBtn = new JButton("Save");
        JButton backBtn = new JButton("Logout");

        saveBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Changes saved successfully!");
        });

        backBtn.addActionListener(e -> {
            new LoginFrame();
            dispose();
        });

        bottomPanel.add(saveBtn);
        bottomPanel.add(backBtn);
        add(bottomPanel, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
