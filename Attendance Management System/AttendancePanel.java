import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.stream.Collectors;

public class AttendancePanel extends JPanel {
    private User user;
    private boolean isAdmin;
    private JTextArea displayArea;
    private JTextField searchDateField;
    private List<String> records = AttendanceDatabase.records;

    public AttendancePanel(User user) {
        this.user = user;
        this.isAdmin = user instanceof Admin;

        setLayout(new BorderLayout());

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem editItem = new JMenuItem("Edit Record");
        JMenuItem logoutItem = new JMenuItem("Logout");
        menu.add(editItem);
        menu.add(logoutItem);
        menuBar.add(menu);

        SwingUtilities.invokeLater(() -> {
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            if (frame != null) {
                frame.setJMenuBar(menuBar);
                frame.revalidate();
            }
        });

        JPanel inputPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        JTextField studentNameField = new JTextField();
        JTextField subjectField = new JTextField();
        JTextField dateField = new JTextField();
        searchDateField = new JTextField();
        JButton markBtn = new JButton("Mark Attendance");
        JButton searchBtn = new JButton("Search by Date");

        if (isAdmin) {
            inputPanel.add(new JLabel("Student Username:"));
            inputPanel.add(studentNameField);
            inputPanel.add(new JLabel("Subject:"));
            inputPanel.add(subjectField);
            inputPanel.add(new JLabel("Date:"));
            inputPanel.add(dateField);
            inputPanel.add(markBtn);
            inputPanel.add(new JLabel(""));
        } else {
            inputPanel.add(new JLabel("Search Date (dd/mm/yyyy):"));
            inputPanel.add(searchDateField);
            inputPanel.add(searchBtn);
            inputPanel.add(new JLabel(""));
        }

        add(inputPanel, BorderLayout.NORTH);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        markBtn.addActionListener(e -> {
            String studentUsername = studentNameField.getText().trim();
            String subject = subjectField.getText().trim();
            String date = dateField.getText().trim();

            if (studentUsername.isEmpty() || subject.isEmpty() || date.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.");
                return;
            }

            String entry = studentUsername + " | " + subject + " | " + date + " | Present";
            records.add(entry);
            refreshDisplay();
        });

        searchBtn.addActionListener(e -> {
            String searchDate = searchDateField.getText().trim();
            if (!searchDate.isEmpty()) {
                refreshDisplay(searchDate);
            } else {
                refreshDisplay();
            }
        });

        editItem.addActionListener(e -> {
            if (!isAdmin) return;

            String oldRecord = JOptionPane.showInputDialog(this, "Enter full record to edit:");
            if (oldRecord == null || !records.contains(oldRecord)) {
                JOptionPane.showMessageDialog(this, "Record not found.");
                return;
            }

            String newRecord = JOptionPane.showInputDialog(this, "Enter new record:", oldRecord);
            if (newRecord != null && !newRecord.isEmpty()) {
                records.remove(oldRecord);
                records.add(newRecord);
                refreshDisplay();
            }
        });

        logoutItem.addActionListener(e -> {
            SwingUtilities.getWindowAncestor(this).dispose();
            new LoginFrame();
        });

        refreshDisplay();
    }

    private void refreshDisplay() {
        refreshDisplay(null);
    }

    private void refreshDisplay(String filterDate) {
        displayArea.setText("");
        List<String> filtered = records;

        if (filterDate != null) {
            filtered = records.stream()
                    .filter(r -> r.contains(filterDate))
                    .collect(Collectors.toList());
        }

        for (String record : filtered) {
            if (isAdmin || record.toLowerCase().startsWith(user.getUsername().toLowerCase() + " |")) {
                displayArea.append(record + "\n");
            }
        }
    }
}
