package layout;

import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("Demonstration of FlowLayout");
        // 1. Set layout manager with setLayout
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        // 2. Add multiple buttons into frame
        for (int i = 0; i < 100; i++) {
            frame.add(new Button("Button " + i));
        }
        // 3. Set the optimal size (pack method)
        frame.pack();
        frame.setVisible(true);
    }
}
