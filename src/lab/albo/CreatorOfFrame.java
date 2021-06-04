package lab.albo;

import javax.swing.*;
import java.awt.*;

public class CreatorOfFrame {
    public final JFrame create(ButtonsOfLabyrinth buttons) {
        JFrame frame = new JFrame("Labyrinth");
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = new Container();
        container.setLayout(new GridBagLayout());
        AddingButtonToFrame buttonToFrame = new AddingButtonToFrame();
        buttonToFrame.addButtonFromMyButtons(buttons, container);
        buttonToFrame.addButtonOfRestart(buttons, container);
        frame.add(container);
        frame.setVisible(true);
        return frame;
    }


}
