import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

    // Declare the text fields and buttons
    private JTextField textField1, textField2, resultField;
    private JLabel label1, label2, resultLabel;
    private JButton addButton, subtractButton, multiplyButton, divideButton;

    // Constructor for the Calculator
    public Calculator() {
        // Set up the JFrame
        setTitle("Simple Calculator");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the components
        label1 = new JLabel("Number 1:");
        label1.setBounds(10, 10, 80, 25);
        textField1 = new JTextField();
        textField1.setBounds(100, 10, 100, 25);
        label2 = new JLabel("Number 2:");
        label2.setBounds(10, 40, 80, 25);
        textField2 = new JTextField();
        textField2.setBounds(100, 40, 100, 25);
        resultLabel = new JLabel("Result:");
        resultLabel.setBounds(10, 80, 80, 25);
        resultField = new JTextField();
        resultField.setEditable(false);
        resultField.setBounds(100, 80, 100, 25);

        addButton = new JButton("+");
        addButton.setBounds(10, 120, 50, 25);
        subtractButton = new JButton("-");
        subtractButton.setBounds(70, 120, 50, 25);
        multiplyButton = new JButton("*");
        multiplyButton.setBounds(130, 120, 50, 25);
        divideButton = new JButton("/");
        divideButton.setBounds(190, 120, 50, 25);

        // Add the action listeners to the buttons
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);

        // Add the components to the JFrame
        add(label1);
        add(textField1);
        add(label2);
        add(textField2);
        add(resultLabel);
        add(resultField);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);

        // Show the JFrame
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(textField1.getText());
        double num2 = Double.parseDouble(textField2.getText());
        double result = 0.0;

        if (e.getSource() == addButton) {
            result = num1 + num2;
        } else if (e.getSource() == subtractButton) {
            result = num1 - num2;
        } else if (e.getSource() == multiplyButton) {
            result = num1 * num2;
        } else if (e.getSource() == divideButton) {
            result = num1 / num2;
        }

        // Display the result
        resultField.setText(Double.toString(result));
    }

    // Main method to start the program
    public static void main(String[] args) {
        new Calculator();
    }
}
