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
        frame.setSize(400, 200);

        // Create components
        JLabel label = new JLabel("Click the button to get greeted:", SwingConstants.CENTER);
        JButton button = new JButton("Say Hello");

        // Create a text field for output
        JTextField textField = new JTextField();
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.CENTER);

        // Add action to button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Greeter greeter = new Greeter();
                textField.setText(greeter.sayHello() + " Somya, how may I help you?");
            }
        });

        // Layout setup
        frame.setLayout(new GridLayout(3, 1));
        frame.add(label);
        frame.add(button);
        frame.add(textField);

        // Display the frame
        frame.setVisible(true);
    }
}
