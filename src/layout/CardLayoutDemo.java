package layout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("CardLayout Demonstration");

        // 1. Create a panel to store multiple cards
        Panel p1 = new Panel();

        // 2. Create CardLayout, and assign it to the previous container
        CardLayout cardLayout = new CardLayout();
        p1.setLayout(cardLayout);

        // 3. Store multiple components into panel
        String [] names = {"Card 1", "Card 2", "Card 3", "Card 4", "Card 5"};
        for (int i = 0; i < names.length; i++) {
            p1.add(names[i], new Button(names[i]));
        }

        // 4. Put panel into the center area of frame
        frame.add(p1);

        // 5. Create another panel p2 to store multiple buttons
        Panel p2 = new Panel();

        // 6. Create buttons
        Button b1 = new Button ("Previous");
        Button b2 = new Button ("Next");
        Button b3 = new Button ("First");
        Button b4 = new Button ("Last");
        Button b5 = new Button ("Third");

        // 7. Create an action listener to listen the button actions
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand(); // The label on the button
                switch (actionCommand) {
                    case "Previous":
                        cardLayout.previous(p1);
                        break;
                    case "Next":
                        cardLayout.next(p1);
                        break;
                    case "First":
                        cardLayout.first(p1);
                        break;
                    case "Last":
                        cardLayout.last(p1);
                        break;
                    case "Third":
                        cardLayout.show(p1, "Card 3");
                        break;
                }
            }
        };

        // 8. Bind the action listeners with the buttons
        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);
        b4.addActionListener(listener);
        b5.addActionListener(listener);

        // 9. Add the buttons into p2
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);

        // 10. Put p2 in the south area of frame
        frame.add(p2, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}
