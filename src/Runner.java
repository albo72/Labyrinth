import java.util.LinkedList;
import java.util.List;

public class Runner {
    private final Checker checker = new Checker();

    public List<LinkedList> moveAndGetTheWay(int x, int y, Labyrinth labyrinth, PossibleExits listOfExits, List<Coordinates> listOfPreviousCoordinates, LinkedList<Coordinates> steps, List<LinkedList> way) {
        Coordinates coordinates = new Coordinates(x, y);
        listOfPreviousCoordinates.add(coordinates);
        steps.addLast(coordinates);
        checker.deleteStepsWithoutLinkage(steps);
        if (labyrinth.getContent().get(y).get(x - 1).equals('.') && !checker.checkPreviousSteps(x - 1, y, listOfPreviousCoordinates)) {
            if (!checker.compareWithExits(x - 1, y, listOfExits.getContent())) {
                moveAndGetTheWay(x - 1, y, labyrinth, listOfExits, listOfPreviousCoordinates, steps, way);
            } else {
                steps.addLast(new Coordinates(x - 1, y));
                checker.deleteStepsWithoutLinkage(steps);
                way.add((LinkedList) steps.clone());
            }
        }
        if (labyrinth.getContent().get(y).get(x + 1).equals('.') && !checker.checkPreviousSteps(x + 1, y, listOfPreviousCoordinates)) {
            if (!checker.compareWithExits(x + 1, y, listOfExits.getContent())) {
                moveAndGetTheWay(x + 1, y, labyrinth, listOfExits, listOfPreviousCoordinates, steps, way);
            } else {
                steps.addLast(new Coordinates(x + 1, y));
                checker.deleteStepsWithoutLinkage(steps);
                way.add((LinkedList) steps.clone());
            }
        }
        if (labyrinth.getContent().get(y + 1).get(x).equals('.') && !checker.checkPreviousSteps(x, y + 1, listOfPreviousCoordinates)) {
            if (!checker.compareWithExits(x, y + 1, listOfExits.getContent())) {
                moveAndGetTheWay(x, y + 1, labyrinth, listOfExits, listOfPreviousCoordinates, steps, way);
            } else {
                steps.addLast(new Coordinates(x, y + 1));
                checker.deleteStepsWithoutLinkage(steps);
                way.add((LinkedList) steps.clone());
            }
        }
        if (labyrinth.getContent().get(y - 1).get(x).equals('.') && !checker.checkPreviousSteps(x, y - 1, listOfPreviousCoordinates)) {
            if (!checker.compareWithExits(x, y - 1, listOfExits.getContent())) {
                moveAndGetTheWay(x, y - 1, labyrinth, listOfExits, listOfPreviousCoordinates, steps, way);
            } else {
                steps.addLast(new Coordinates(x, y - 1));
                checker.deleteStepsWithoutLinkage(steps);
                way.add((LinkedList) steps.clone());
            }
        }
        return way;
    }
}