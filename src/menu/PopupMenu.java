package menu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenu {
    private Frame frame = new Frame("PopupMenu Demonstration");

    // Create Text Area
    TextArea ta = new TextArea("Jiaming Guo",6,40);

    // Create Panel Container
    Panel p = new Panel();

    // Create PopupMenu
    java.awt.PopupMenu popupMenu = new java.awt.PopupMenu();

    // Create menu items
    MenuItem comment = new MenuItem("Comment");
    MenuItem cancelComment = new MenuItem("Cancel Comment");
    MenuItem copy = new MenuItem("Copy");
    MenuItem save = new MenuItem("Save");

    public void init(){
        // Construct the view
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();
                ta.append("You clicked： "+actionCommand+"\n");
            }
        };

        comment.addActionListener(listener);
        cancelComment.addActionListener(listener);
        copy.addActionListener(listener);
        save.addActionListener(listener);

        popupMenu.add(comment);
        popupMenu.add(cancelComment);
        popupMenu.add(copy);
        popupMenu.add(save);

        p.add(popupMenu);

        // Set Panel size
        p.setPreferredSize(new Dimension(400,300));

        // Register mouse events for Panel, show the menu when mouse released
        p.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                boolean flag = e.isPopupTrigger();
                if (flag){
                    // Show pop up menu
                    popupMenu.show(p,e.getX(),e.getY());
                }
            }
        });

        frame.add(ta);
        frame.add(p,BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new PopupMenu().init();
    }
}
