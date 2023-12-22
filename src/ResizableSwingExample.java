import javax.swing.*;
import java.awt.*;

public class ResizableSwingExample {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Resizable Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JPanel
        JPanel panel = new JPanel();

        // Set the layout manager for the panel (optional)
        panel.setLayout(new FlowLayout());

        // Create some components (buttons in this case)
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        // Add components to the panel
        panel.add(button1);
        panel.add(button2);

        // Add the panel to the frame
        frame.add(panel);

        // Make the JFrame resizable
        frame.setResizable(true);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
