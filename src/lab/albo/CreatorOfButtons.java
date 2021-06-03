package lab.albo;

import javax.swing.*;
import java.awt.*;

public class CreatorOfButtons {
    public final JButton[][] createArrayOfLabyrinthButtons(Labyrinth labyrinth) {
        JButton[][] arrayOfButtons = new JButton[labyrinth.getContent().size()][labyrinth.getContent().get(0).size()];
        for (int i = 0; i < arrayOfButtons.length; i++) {
            for (int j = 0; j < arrayOfButtons[0].length; j++) {
                if (labyrinth.getContent().get(i).get(j).equals('.')) {
                    addButtonToArray(arrayOfButtons, i, j, Color.CYAN);
                } else {
                    addButtonToArray(arrayOfButtons, i, j, Color.BLACK);
                }
            }
        }
        return arrayOfButtons;
    }

    private void addButtonToArray(JButton[][] arrayOfButtons, int i, int j, Color cyan) {
        JButton button = new JButton();
        button.setPreferredSize(new Dimension(10, 10));
        button.setBackground(cyan);
        button.setBorder(BorderFactory.createEmptyBorder());
        arrayOfButtons[i][j] = button;
    }
}
