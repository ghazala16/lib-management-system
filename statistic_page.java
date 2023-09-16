import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class statistic_page {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Library Management System - Statistics");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JTextArea statisticsTextArea = new JTextArea();
        statisticsTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(statisticsTextArea);

        JButton generateButton = new JButton("Generate Statistics");
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement the logic to fetch and display statistics
                String statisticsData = fetchAndFormatStatistics();
                statisticsTextArea.setText(statisticsData);
            }
        });

        panel.add(generateButton, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    // Implement the logic to fetch and format library statistics
    private static String fetchAndFormatStatistics() {
        // Replace this with your actual logic to fetch library statistics
        // This can include information such as the number of books, number of patrons, most borrowed books, etc.
        // Format the data as a string and return it for display in the JTextArea.
        String statisticsData = "Library Statistics:\n";
        statisticsData += "Total Books: 500\n";
        statisticsData += "Total Patrons: 200\n";
        statisticsData += "Most Borrowed Book: 'The Great Gatsby'\n";
        return statisticsData;
    }
}
