package menu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class SimpleMenu {
    private Frame frame = new Frame("Menu Demonstration");

    // Create menu bar
    MenuBar menuBar = new MenuBar();

    // Create menu components
    Menu fileMenu = new Menu("File");
    Menu editMenu = new Menu("Edit");
    Menu formatMenu = new Menu("Format");

    // menu item component
    MenuItem auto = new MenuItem("Auto line wrap");
    MenuItem copy = new MenuItem("Copy");
    MenuItem paste = new MenuItem("Paste");

    MenuItem comment = new MenuItem("Comment",new MenuShortcut(KeyEvent.VK_Q,true));//Shortcut  ctrl+shift+Q
    MenuItem cancelComment = new MenuItem("Cancel Comment");

    TextArea ta = new TextArea(6,40);

    public void init(){
        // Construct the view
        comment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.append("You clicked： "+e.getActionCommand()+"\n");
            }
        });

        formatMenu.add(comment);
        formatMenu.add(cancelComment);

        // Construct Edit menu
        editMenu.add(auto);
        editMenu.add(copy);
        editMenu.add(paste);
        editMenu.add(formatMenu);

        // Construct menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        frame.setMenuBar(menuBar);
        frame.add(ta);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleMenu().init();
    }
}
