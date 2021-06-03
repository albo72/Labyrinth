package lab.albo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CreatingListWithCoordinatesOfWay {
    public List<LinkedList> create(Labyrinth labyrinth, int x, int y) {
        Runner runner = new Runner();
        SearherOfPossibleExits searherOfPossibleExits = new SearherOfPossibleExits();
        PossibleExits exits = new PossibleExits(searherOfPossibleExits.search(labyrinth));
        List<Coordinates> listOfPreviousCoordinates = new ArrayList<>();
        LinkedList<Coordinates> steps = new LinkedList<>();
        List<LinkedList> way = new ArrayList<>();
        if (labyrinth.getContent().get(y).get(x).equals('.')) {
            return runner.moveAndGetTheWay(new Coordinates(x, y), labyrinth, exits, listOfPreviousCoordinates, steps, way);
        } else {
            return null;
        }
    }
}
