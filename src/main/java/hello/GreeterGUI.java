package hello;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GreeterGUI {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Greeter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 250);
        frame.setLayout(new GridLayout(4, 1));

        // Create a panel for colorful background
        JPanel panel = new JPanel();
        panel.setBackground(new Color(135, 206, 250)); // Light Sky Blue
        panel.setLayout(new GridLayout(4, 1));

        // Label
        JLabel label = new JLabel("Enter your first name:", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        label.setForeground(Color.BLUE);

        // Text field for input
        JTextField nameField = new JTextField();
        nameField.setHorizontalAlignment(JTextField.CENTER);
        nameField.setFont(new Font("Arial", Font.PLAIN, 14));

        // Button to submit name (updated color to blue)
        JButton button = new JButton("Submit");
        button.setBackground(new Color(30, 144, 255)); // Dodger Blue
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 14));

        // Output field
        JTextField textField = new JTextField();
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setFont(new Font("Arial", Font.BOLD, 14));
        textField.setForeground(Color.MAGENTA);

        // Button Action
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                if (!name.isEmpty()) {
                    textField.setText("Hello " + name + ", how may I help you?");
                } else {
                    textField.setText("Please enter your name first.");
                }
            }
        });

        // Add components to panel
        panel.add(label);
        panel.add(nameField);
        panel.add(button);
        panel.add(textField);

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
