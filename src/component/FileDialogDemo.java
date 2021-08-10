package component;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileDialogDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("FileDialog Demonstration");

        // Create 2 file dialogs
        FileDialog f1 = new FileDialog(frame,"Choose the file to open",FileDialog.LOAD);
        FileDialog f2 = new FileDialog(frame,"Choose the saving directory",FileDialog.SAVE);

        // Create 2 buttons
        Button b1 = new Button("Open File");
        Button b2 = new Button("Save File");

        // Set action for buttons when clicked (get the directory of opening and saving file)
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(true); // Code with pause here

                // Get the chosen directory and file
                String directory = f1.getDirectory();
                String file = f1.getFile();
                System.out.println("Opened the directory is："+directory);
                System.out.println("Opened filename is："+file);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.setVisible(true);

                //获取选择的路径及文件
                String directory = f2.getDirectory();
                String file = f2.getFile();
                System.out.println("Saving directory："+directory);
                System.out.println("Saving filename："+file);
            }
        });

        frame.add(b1,BorderLayout.NORTH);
        frame.add(b2);
        frame.pack();
        frame.setVisible(true);
    }
}
