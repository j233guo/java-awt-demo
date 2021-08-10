package graphic;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class ReadAndSaveImage {

    private Frame frame = new Frame("Image Viewer");

    MenuBar menuBar = new MenuBar();
    Menu menu = new Menu("File");
    MenuItem open = new MenuItem("Open");
    MenuItem save = new MenuItem("Save As");


    // Declare BufferedImage, log the local image saved in memory
    BufferedImage image;
    private class MyCanvas extends Canvas{
        @Override
        public void paint(Graphics g) {
            g.drawImage(image,0,0,null);
        }
    }
    MyCanvas drawArea = new MyCanvas();

    public void init() throws Exception{
        // Construct the view

        open.addActionListener(e->{
            // Open a file dialog
            FileDialog fileDialog = new FileDialog(frame,"Open image",FileDialog.LOAD);
            fileDialog.setVisible(true);

            // Get directory and file name
            String dir = fileDialog.getDirectory();
            String fileName = fileDialog.getFile();

            try {
                image = ImageIO.read(new File(dir,fileName));
                drawArea.repaint();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        save.addActionListener(e->{
            // Show a file dialog
            FileDialog fileDialog = new FileDialog(frame,"Save Image",FileDialog.SAVE);
            fileDialog.setVisible(true);

            // Get the user set directory and file name
            String dir = fileDialog.getDirectory();
            String fileName = fileDialog.getFile();

            try {
                ImageIO.write(image,"JPEG",new File(dir,fileName));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        menu.add(open);
        menu.add(save);

        menuBar.add(menu);

        // Put the menu into window
        frame.setMenuBar(menuBar);
        frame.add(drawArea);

        frame.setBounds(200,200,740,508);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) throws Exception {
        new ReadAndSaveImage().init();
    }
}
