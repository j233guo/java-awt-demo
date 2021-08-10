package container;

import java.awt.*;

public class PanelDemo {
    public static void main(String[] args) {
        // 1. Create a window first, because panel and other containers must be in a window
        Frame frame = new Frame("Demonstration of Panel");
        // 2. Create a panel
        Panel p = new Panel();
        // 3. Create a text box and a button, then put them into panel container
        p.add(new TextField("This is a test text"));
        p.add(new Button("This is a test button"));
        // 4. Put the panel into the window
        frame.add(p);
        // 5. Set the position and size of window
        frame.setBounds(100,100,500,300);
        // 6. Set the window to be visible
        frame.setVisible(true);
    }
}
