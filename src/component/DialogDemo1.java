package component;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogDemo1 {
    public static void main(String[] args) {
        Frame frame = new Frame("Dialog Demonstration 1");

        // 1. Create a 2 dialog objects, modal and non-modal
        Dialog d1 = new Dialog(frame, "Modal Dialog", true);
        Dialog d2 = new Dialog(frame, "Non-Modal Dialog", false);

        // 2. Set the position and size with setBounds
        d1.setBounds(20, 30, 300, 200);
        d2.setBounds(20, 30, 300, 200);

        // 3. Create 2 buttons
        Button b1 = new Button("Open Modal Dialog");
        Button b2 = new Button("Open Non-Modal Dialog");

        // 4. Add actions for the 2 buttons
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d1.setVisible(true);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d2.setVisible(true);
            }
        });

        // 5. Add the buttons into frame
        frame.add(b1, BorderLayout.NORTH);
        frame.add(b2);

        frame.pack();
        frame.setVisible(true);
    }

}
