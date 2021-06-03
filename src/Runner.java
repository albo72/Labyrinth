import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Runner {
    private final Checker checker = new Checker();

    public List<LinkedList> moveAndGetTheWay(Coordinates coordinates, Labyrinth labyrinth, PossibleExits listOfExits, List<Coordinates> listOfPreviousCoordinates, LinkedList<Coordinates> steps, List<LinkedList> way) {
        listOfPreviousCoordinates.add(coordinates);
        steps.addLast(coordinates);
        checker.deleteStepsWithoutLinkage(steps);
        if (checker.isCanGo(labyrinth, listOfPreviousCoordinates, coordinates.getY(), coordinates.getX() - 1)) {
            if (!checker.compareWithExits(coordinates.getX() - 1, coordinates.getY(), listOfExits.getContent())) {
                moveAndGetTheWay(new Coordinates(coordinates.getX() - 1, coordinates.getY()), labyrinth, listOfExits, listOfPreviousCoordinates, steps, way);
            } else {
                checker.createLastCoordinateAndAddWay(steps, way, coordinates.getX() - 1, coordinates.getY());
            }
        }
        if (checker.isCanGo(labyrinth, listOfPreviousCoordinates, coordinates.getY(), coordinates.getX() + 1)) {
            if (!checker.compareWithExits(coordinates.getX() + 1, coordinates.getY(), listOfExits.getContent())) {
                moveAndGetTheWay(new Coordinates(coordinates.getX() + 1, coordinates.getY()), labyrinth, listOfExits, listOfPreviousCoordinates, steps, way);
            } else {
                checker.createLastCoordinateAndAddWay(steps, way, coordinates.getX() + 1, coordinates.getY());
            }
        }
        if (checker.isCanGo(labyrinth, listOfPreviousCoordinates, coordinates.getY() + 1, coordinates.getX())) {
            if (!checker.compareWithExits(coordinates.getX(), coordinates.getY() + 1, listOfExits.getContent())) {
                moveAndGetTheWay(new Coordinates(coordinates.getX(), coordinates.getY() + 1), labyrinth, listOfExits, listOfPreviousCoordinates, steps, way);
            } else {
                checker.createLastCoordinateAndAddWay(steps, way, coordinates.getX(), coordinates.getY() + 1);
            }
        }
        if (checker.isCanGo(labyrinth, listOfPreviousCoordinates, coordinates.getY() - 1, coordinates.getX())) {
            if (!checker.compareWithExits(coordinates.getX(), coordinates.getY() - 1, listOfExits.getContent())) {
                moveAndGetTheWay(new Coordinates(coordinates.getX(), coordinates.getY() - 1), labyrinth, listOfExits, listOfPreviousCoordinates, steps, way);
            } else {
                checker.createLastCoordinateAndAddWay(steps, way, coordinates.getX(), coordinates.getY() - 1);
            }
        }
        return way;
    }


}