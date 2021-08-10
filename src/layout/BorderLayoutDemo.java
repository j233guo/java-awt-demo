package layout;

import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("Demonstration of BorderLayout");
        // 1. Set BorderLayout for frame
        frame.setLayout(new BorderLayout(30, 10));
        // 2. Add component into frame into corresponding position
        frame.add(new Button("North Button"), BorderLayout.NORTH);
        frame.add(new Button("South Button"), BorderLayout.SOUTH);
        frame.add(new Button("East Button"), BorderLayout.EAST);
        frame.add(new Button("West Button"), BorderLayout.WEST);
        frame.add(new Button("Centre Button"), BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}
