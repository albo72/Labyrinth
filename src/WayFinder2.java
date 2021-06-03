import java.awt.*;

public class WayFinder2 {
    public void findWay(MyButtons buttons, Coordinates coordinates, Labyrinth labyrinth){
        CoordinatesOfWay coordinatesOfWay = new CoordinatesOfWay(labyrinth, coordinates.getX(),coordinates.getY());
        for (int i = 0; i < coordinatesOfWay.getContent().size() ; i++) {
            for (int j = 0; j < coordinatesOfWay.getContent().get(i).size(); j++) {
                buttons.getButtons()[((Coordinates)coordinatesOfWay.getContent().get(i).get(j)).getY()][((Coordinates)coordinatesOfWay.getContent().get(i).get(j)).getX()].setBackground(Color.RED);
            }
        }
    }
}
