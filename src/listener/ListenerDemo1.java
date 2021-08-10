package listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListenerDemo1 {
    public static void main(String[] args) {
        Frame frame = new Frame("Listener Demonstration");

        // Create component (source of event)
        TextField tf = new TextField(30);
        Choice names = new Choice();
        names.add("Liu Yan");
        names.add("Shu Qi");
        names.add("Yan Ni");

        // Add TextListener to the TextField, listen to changes in text
        tf.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                String text = tf.getText();
                System.out.println("The current content in the text field is："+text);
            }
        });

        // Add ItemListener to the choice list, listen to changes in item
        names.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Object item = e.getItem();
                System.out.println("The current chosen item is：" + item);
            }
        });

        // Register ContainerListener listener to frame, listen to adding of components in container
        frame.addContainerListener(new ContainerListener() {
            @Override
            public void componentAdded(ContainerEvent e) {
                Component child = e.getChild();
                System.out.println("You added "+ child + " to the frame");
            }

            @Override
            public void componentRemoved(ContainerEvent e) {

            }
        });

        Box hBox = Box.createHorizontalBox();
        hBox.add(names);
        hBox.add(tf);
        frame.add(hBox);

        frame.pack();
        frame.setVisible(true);
    }
}
