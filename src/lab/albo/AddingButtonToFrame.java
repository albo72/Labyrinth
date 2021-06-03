package lab.albo;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

public class AddingButtonToFrame {
    public void addButtonFromMyButtons(ButtonsOfLabyrinth buttons, Container container) {
        for (int i = 0; i < buttons.getButtons().length; i++) {
            for (int j = 0; j < buttons.getButtons()[0].length; j++) {
                container.add(buttons.getButtons()[i][j], creatingNewGrid(j, i, 1, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0));
            }
        }
    }

    public void addButtonOfRestart(ButtonsOfLabyrinth buttons, Container container) {
        JButton buttonRestart = new JButton("Начать заново");
        buttonRestart.setBackground(Color.GREEN);
        buttonRestart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < buttons.getButtons().length; i++) {
                    for (int j = 0; j < buttons.getButtons()[0].length; j++) {
                        if (buttons.getButtons()[i][j].getBackground().equals(Color.RED)) {
                            buttons.getButtons()[i][j].setBackground(Color.CYAN);
                        }
                    }
                }
            }
        });
        container.add(buttonRestart, creatingNewGrid(0, buttons.getButtons().length + 2, 0, 0.0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, 20));
    }

    private Serializable creatingNewGrid(int i, int i2, int i3, double v, int north, int horizontal, int i4) {
        return new GridBagConstraints(i, i2, i3, i3, v, v, north, horizontal, new Insets(0, 0, 0, 0), 0, i4);
    }

}
