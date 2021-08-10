package graphic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleDraw {
    private final String RECT_SHAPE="rect";
    private final String OVAL_SHAPE="oval";

    private Frame frame = new Frame("Drawing Demonstration");

    Button btnRect = new Button("Draw Rectangle");
    Button btnOval = new Button("Draw Oval");

    // Define a variable to determine the current shape to draw, rectangle or oval
    private String shape = "";

    // Customize class, extending Canvas, and override paint method
    private class MyCanvas extends Canvas{
        @Override
        public void paint(Graphics g) {
            // Draw different shapes
            if (shape.equals(RECT_SHAPE)){
                // Draw rectangle
                g.setColor(Color.BLACK);// Set the brush to be black
                g.drawRect(100,100,150,100);

            }else if(shape.equals(OVAL_SHAPE)){
                // Draw oval
                g.setColor(Color.RED);
                g.drawOval(100,100,150,100);
            }
        }
    }

    // Create custom canvas object
    MyCanvas drawArea = new MyCanvas();

    public void init(){
        // Construct the view
        btnRect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // change the tag to rect
                shape = RECT_SHAPE;
                drawArea.repaint();
            }
        });

        btnOval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // change to tag to oval
                shape = OVAL_SHAPE;
                drawArea.repaint();
            }
        });

        // create the panel to place buttons
        Panel p = new Panel();
        p.add(btnRect);
        p.add(btnOval);

        frame.add(p,BorderLayout.SOUTH);

        // set size for draw area
        drawArea.setPreferredSize(new Dimension(300,300));
        frame.add(drawArea);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleDraw().init();
    }
}
