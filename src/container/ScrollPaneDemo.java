package container;

import java.awt.*;

public class ScrollPaneDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("Demonstration of scroll pane");

        // 1. Create a ScrollPane
        ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        // 2. Add contents into ScrollPane
        sp.add(new TextField("This is a test text"));
        sp.add(new Button("This is a test button"));
        // 3. Add ScrollPane into Frame
        frame.add(sp);

        frame.setBounds(100, 100, 500, 300);
        frame.setVisible(true);
    }
}
