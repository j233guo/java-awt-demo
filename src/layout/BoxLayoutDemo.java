package layout;

import java.awt.*;
import javax.swing.*;

public class BoxLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("BoxLayout Demonstration");

        // 1. Based on frame, create a BoxLayout  vertical
        BoxLayout boxLayout = new BoxLayout(frame, BoxLayout.Y_AXIS);

        // 2. Set box layout for frame
        frame.setLayout(boxLayout);

        // 3. Add 2 buttons
        frame.add(new Button("Button 1"));
        frame.add(new Button("Button 2"));

        frame.pack();
        frame.setVisible(true);
    }
}
