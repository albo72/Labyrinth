package lab.albo;

import javax.swing.*;

public class ButtonsOfLabyrinth {
    private final JButton[][] buttons;

    public ButtonsOfLabyrinth(JButton[][] buttons) {
        this.buttons = buttons;
    }

    public JButton[][] getButtons() {
        return buttons;
    }
}
