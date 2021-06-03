import javax.swing.*;
import java.awt.*;

public class CreatorOfFrame {
    public final JFrame create(MyButtons buttons) {
        JFrame frame = new JFrame("Labyrinth");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = new Container();
        container.setLayout(new GridBagLayout());
        for (int i = 0; i < buttons.getButtons().length; i++) {
            for (int j = 0; j < buttons.getButtons()[0].length; j++) {
                container.add(buttons.getButtons()[i][j], new GridBagConstraints(j, i, 1, 1, 0.0, 0.0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            }
        }
        frame.add(container);
        frame.pack();
        frame.setVisible(true);
        return frame;
    }

}
