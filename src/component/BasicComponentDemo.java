package component;

import java.awt.*;
import javax.swing.*;

public class BasicComponentDemo {
    Frame frame = new Frame("Basic Component Demonstration");

    TextArea ta = new TextArea(5, 20);

    Choice colorChooser = new Choice();

    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox male = new Checkbox("male", cbg, true);
    Checkbox female = new Checkbox("female", cbg, false);

    Checkbox isMarried = new Checkbox("Married");

    TextField tf = new TextField(20);
    Button ok = new Button("OK");

    List colorList = new List(6, true);

    public void init() {
        // Construct the interface

        // Construct the bottom part
        Box bBox = Box.createHorizontalBox();
        bBox.add(tf);
        bBox.add(ok);
        frame.add(bBox, BorderLayout.SOUTH);

        // Construct the choice part
        colorChooser.add("Red");
        colorChooser.add("Blue");
        colorChooser.add("Green");

        Box cBox = Box.createHorizontalBox();
        cBox.add(colorChooser);
        cBox.add(male);
        cBox.add(female);
        cBox.add(isMarried);

        // Construct the text area and choice
        Box topLeft = Box.createVerticalBox();
        topLeft.add(ta);
        topLeft.add(cBox);

        // Construct the top left and list
        colorList.add("red");
        colorList.add("green");
        colorList.add("blue");

        Box top = Box.createHorizontalBox();
        top.add(topLeft);
        top.add(colorList);

        frame.add(top);

        // Set the optimal size for frame and set it visible
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BasicComponentDemo().init();
    }

}
