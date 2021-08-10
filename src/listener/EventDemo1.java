package listener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo1 {
    Frame frame = new Frame("Event Demonstration");

    TextField tf = new TextField(30);

    // Source of event
    Button ok = new Button("OK");

    public void init() {
        // Construct the view
        // Listener
        //MyListener myListener = new MyListener();

        // Register the listener
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You clicked OK button");
                tf.setText("Hello World");
            }
        });

        // put tf and ok into frame
        frame.add(tf,BorderLayout.NORTH);
        frame.add(ok);

        frame.pack();
        frame.setVisible(true);
    }

    /*private class MyListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            tf.setText("Hello World");
        }

    }*/

    public static void main(String[] args) {
        new EventDemo1().init();
    }
}
