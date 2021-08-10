package container;

import java.awt.*;

public class WindowDemo {
    public static void main(String[] args) {
        // 1. Create a window (frame)
        Frame frame = new Frame("Demonstration of Window (frame)");
        // 2. Set window's location and size
        frame.setLocation(100, 100);
        frame.setSize(500, 300);
        // 3. Set the window to be visible
        frame.setVisible(true);
    }
}
