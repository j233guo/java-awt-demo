package layout;

import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("Calculator");

        // 1. Create a Panel, and put a TextField inside
        Panel p = new Panel();
        p.add(new TextField(30));
        // 2. Put the Panel into the north area of frame
        frame.add(p, BorderLayout.NORTH);
        // 3. Create a Panel and set its layout as GridLayout
        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(3, 5, 4, 4));
        // 4. Add contents into the Panel
        for (int i = 0; i < 10; i++) {
            p2.add(new Button(i+""));
        }
        p2.add(new Button("+"));
        p2.add(new Button("-"));
        p2.add(new Button("*"));
        p2.add(new Button("/"));
        p2.add(new Button("."));
        // 5. Add the Panel into the frame
        frame.add(p2);

        frame.pack();
        frame.setVisible(true);
    }
}
