import javax.swing.*;
import java.awt.*;
import java.io.PrintWriter;

public class NotepadGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Notepad");

        JTextArea textArea = new JTextArea();

        textArea.setFont(
                new Font("Arial", Font.PLAIN, 22));

        JButton saveButton =
                new JButton("Save Note");

        saveButton.setFont(
                new Font("Arial", Font.BOLD, 16));

        saveButton.addActionListener(e -> {

            try {

                PrintWriter writer =
                        new PrintWriter("note.txt");

                writer.print(textArea.getText());

                writer.close();

                JOptionPane.showMessageDialog(
                        frame,
                        "Note Saved Successfully!");

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        frame,
                        "Error Saving File");
            }
        });

        JScrollPane scrollPane =
                new JScrollPane(textArea);

        frame.add(scrollPane, BorderLayout.CENTER);

        frame.add(saveButton, BorderLayout.SOUTH);

        frame.setSize(700, 500);

        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}