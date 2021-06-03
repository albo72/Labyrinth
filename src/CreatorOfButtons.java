import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CreatorOfButtons {
    public final JButton[][] createArrayOfLabyrinthButtons(Labyrinth labyrinth) {
        JButton[][] arrayOfButtons = new JButton[labyrinth.getContent().size()][labyrinth.getContent().get(0).size()];
        for (int i = 0; i < arrayOfButtons.length; i++) {
            for (int j = 0; j < arrayOfButtons[0].length; j++) {
                if (labyrinth.getContent().get(i).get(j).equals('.')) {
                    JButton button = new JButton();
                    button.setPreferredSize(new Dimension(10, 10));
                    button.setBackground(Color.CYAN);
                    button.setBorder(BorderFactory.createEmptyBorder());
                    button.addActionListener(new ChangerColorOfButton(button));
                    arrayOfButtons[i][j] = button;
                } else {
                    JButton button = new JButton();
                    button.setPreferredSize(new Dimension(10, 10));
                    button.setBackground(Color.BLACK);
                    button.setBorder(BorderFactory.createEmptyBorder());
                    arrayOfButtons[i][j] = button;
                }
            }
        }
        return arrayOfButtons;
    }
}
