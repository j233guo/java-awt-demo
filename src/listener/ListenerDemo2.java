package listener;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListenerDemo2 {
    public static void main(String[] args) {
        Frame frame = new Frame("WindowListener Demonstration");
        frame.setBounds(200,200,500,300);

        // Set WindowListener, listen to the click of X button.
        // If X is clicked then close the window.
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Stop the program
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}
