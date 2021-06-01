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
        while (way.size() > 1 && (!checkLinkageInList(way, -1, 0) && !checkLinkageInList(way, 1, 0) && !checkLinkageInList(way, 0, -1) && !checkLinkageInList(way, 0, 1))) {
            way.remove(way.size() - 2);
        }
    }

    public boolean checkLinkageInList(LinkedList<Coordinates> way, int x, int y) {
        return way.getLast().getX() + x == way.get(way.size() - 2).getX() && way.getLast().getY() + y == way.get(way.size() - 2).getY();
    }
}
