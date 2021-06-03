package lab.albo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WayFinderInFrame {
    public void findWay(ButtonsOfLabyrinth buttons, Labyrinth labyrinth) {
        for (int i = 0; i < buttons.getButtons().length; i++) {
            for (int j = 0; j < buttons.getButtons()[0].length; j++) {
                if (buttons.getButtons()[i][j].getBackground().equals(Color.CYAN) && isaBorder(buttons, i, j)) {
                    int finalJ = j;
                    int finalI = i;
                    buttons.getButtons()[i][j].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            CreatingListWithCoordinatesOfWay listWithCoordinatesOfWay = new CreatingListWithCoordinatesOfWay();
                            CoordinatesOfWay coordinatesOfWay = new CoordinatesOfWay(listWithCoordinatesOfWay.create(labyrinth, finalJ, finalI));
                            for (int k = 0; k < coordinatesOfWay.getContent().size(); k++) {
                                for (int l = 0; l < coordinatesOfWay.getContent().get(k).size(); l++) {
                                    buttons.getButtons()[((Coordinates) coordinatesOfWay.getContent().get(k).get(l)).getY()][((Coordinates) coordinatesOfWay.getContent().get(k).get(l)).getX()].setBackground(Color.RED);
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    private boolean isaBorder(ButtonsOfLabyrinth buttons, int i, int j) {
        return i != 0 && i != buttons.getButtons().length - 1 && j != 0 && j != buttons.getButtons()[0].length - 1;
    }

}
