package layout;

import java.awt.*;
import javax.swing.*;

public class BoxLayoutDemo2 {
    public static void main(String[] args) {
        Frame frame = new Frame("BoxLayout Demonstration 2");

        // 1. Create a horizontal Box container
        Box hBox = Box.createHorizontalBox();

        // 2. Add 2 buttons to the container
        hBox.add(new Button("horizontal button 1"));
        hBox.add(new Button("horizontal button 2"));

        // 3. Create a vertical Box container
        Box vBox = Box.createVerticalBox();

        // 4. Add 2 buttons to the container
        vBox.add(new Button("vertical button 1"));
        vBox.add(new Button("vertical button 2"));

        // 5. Put the 2 Box containers into frame
        frame.add(hBox, BorderLayout.NORTH);
        frame.add(vBox);

        frame.pack();
        frame.setVisible(true);
    }
}
