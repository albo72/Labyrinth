package lab.albo;

import java.util.LinkedList;
import java.util.List;

public class Checker {
    public boolean checkPreviousSteps(int x, int y, List<Coordinates> listOfPreviousCoordinates) {
        for (Coordinates coord : listOfPreviousCoordinates) {
            if (coord.equals(new Coordinates(x, y))) {
                return true;
            }
        }
        return false;
    }

    public boolean compareWithExits(int x, int y, List<Coordinates> listOfExits) {
        Coordinates coordinates = new Coordinates(x, y);
        for (Coordinates coord : listOfExits) {
            if (coord.equals(coordinates)) {
                return true;
            }
        }
        return false;
    }

    public void deleteStepsWithoutLinkage(LinkedList<Coordinates> way) {
        while (way.size() > 1 && checkLinkageInList(way)) {
            way.remove(way.size() - 2);
        }
    }

    private boolean checkLinkageInList(LinkedList<Coordinates> way) {
        return !checkLinkageWithPreviousCoordinates(way, -1, 0) && !checkLinkageWithPreviousCoordinates(way, 1, 0) && !checkLinkageWithPreviousCoordinates(way, 0, -1) && !checkLinkageWithPreviousCoordinates(way, 0, 1);
    }

    public boolean checkLinkageWithPreviousCoordinates(LinkedList<Coordinates> way, int x, int y) {
        return way.getLast().getX() + x == way.get(way.size() - 2).getX() && way.getLast().getY() + y == way.get(way.size() - 2).getY();
    }

    public boolean isCanGo(Labyrinth labyrinth, List<Coordinates> listOfPreviousCoordinates, int y, int i) {
        return labyrinth.getContent().get(y).get(i).equals('.') && !checkPreviousSteps(i, y, listOfPreviousCoordinates);
    }

    public void createLastCoordinateAndAddWay(LinkedList<Coordinates> steps, List<LinkedList> way, int i, int y) {
        steps.addLast(new Coordinates(i, y));
        deleteStepsWithoutLinkage(steps);
        way.add(new LinkedList(steps));
    }
}
