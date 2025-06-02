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
        frame.setSize(500, 400);
        frame.setLayout(new GridBagLayout());

        // Create main panel with black background
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.BLACK);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Label with pink background and white bold font
        JLabel label = new JLabel("Enter your Name", SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBackground(Color.PINK);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setBorder(BorderFactory.createLineBorder(Color.PINK, 10));
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(label, gbc);

        // Input field
        JTextField nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.BOLD, 20));
        nameField.setHorizontalAlignment(JTextField.CENTER);
        nameField.setBorder(BorderFactory.createLineBorder(Color.WHITE, 10, true));
        gbc.gridy = 1;
        panel.add(nameField, gbc);

        // Submit Button
        JButton button = new JButton("Submit");
        button.setFont(new Font("Arial", Font.BOLD, 22));
        button.setBackground(Color.PINK);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(Color.PINK, 10, true));
        button.setOpaque(true);
        gbc.gridy = 2;
        panel.add(button, gbc);

        // Output Field
        JTextField outputField = new JTextField();
        outputField.setEditable(false);
        outputField.setHorizontalAlignment(JTextField.CENTER);
        outputField.setFont(new Font("Arial", Font.BOLD, 22));
        outputField.setBackground(new Color(0, 191, 255)); // DeepSkyBlue
        outputField.setForeground(Color.WHITE);
        outputField.setBorder(BorderFactory.createLineBorder(new Color(0, 191, 255), 10, true));
        gbc.gridy = 3;
        panel.add(outputField, gbc);

        // Action listener
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                if (!name.isEmpty()) {
                    outputField.setText("Hello  " + name + " How may I help You");
                } else {
                    outputField.setText("Please enter your name first.");
                }
            }
        });

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
