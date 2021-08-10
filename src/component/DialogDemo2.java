package component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogDemo2 {
    public static void main(String[] args) {
        Frame frame = new Frame("Dialog Demonstration 1");

        // 1. Create a dialog
        Dialog d1 = new Dialog(frame, "Modal Dialog", true);

        // 2. Create a vBox, add a TextField and Box
        Box vBox = Box.createVerticalBox();
        vBox.add(new TextField(20));
        vBox.add(new Button("OK"));

         // Add box into Dialog
        d1.add(vBox);

        // Create button
        Button b1 = new Button("Open Modal Dialog");

        // 4. Add actions for the 2 buttons
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d1.setVisible(true);
            }
        });

        // 5. Add the buttons into frame
        frame.add(b1, BorderLayout.NORTH);

        frame.pack();
        frame.setVisible(true);
    }

}
