package layout;

import java.awt.*;
import javax.swing.*;

public class BoxLayoutDemo3 {
    public static void main(String[] args) {
        Frame frame = new Frame("BoxLayout Demonstration 3");

        // 1. Create horizontal Box hBox
        Box hBox = Box.createHorizontalBox();

        // 2. Add buttons into hBox, and add gap between buttons
        hBox.add(new Button("horizontal button 1"));
        hBox.add(Box.createHorizontalGlue()); // This gap can be stretched in both direction
        hBox.add(new Button("horizontal button 2"));
        hBox.add(Box.createHorizontalStrut(30));
        hBox.add(new Button("horizontal button 3"));

        // 3. Create vertical Box vBox
        Box vBox = Box.createVerticalBox();

        // 4. Add buttons into vBox, and add glue between buttons
        vBox.add(new Button("vertical button 1"));
        vBox.add(Box.createVerticalGlue()); // This glue can be stretched in both direction
        vBox.add(new Button("vertical button 2"));
        vBox.add(Box.createVerticalStrut(30));
        vBox.add(new Button("vertical button 3"));

        // 5. Add the boxes into frame
        frame.add(hBox, BorderLayout.NORTH);
        frame.add(vBox, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}
