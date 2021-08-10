package layout;

import java.awt.*;

public class BorderLayoutDemo2 {
    public static void main(String[] args) {
        Frame frame = new Frame("Demonstration of BorderLayout");
        // 1. Set BorderLayout for frame
        frame.setLayout(new BorderLayout(30, 10));
        // 2. Add component into frame into corresponding position
        frame.add(new Button("North Button"), BorderLayout.NORTH);
        frame.add(new Button("South Button"), BorderLayout.SOUTH);

        Panel p = new Panel();
        p.add(new Button("Centre Button"));
        p.add(new TextField("Test text"));

        frame.add(p);
        frame.pack();
        frame.setVisible(true);
    }
}
