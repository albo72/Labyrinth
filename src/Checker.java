import java.util.LinkedList;
import java.util.List;

public class Checker {
    public boolean checkPreviousSteps(int x, int y, List<Coordinates> listOfPreviousCoordinates){
        for (Coordinates coord:listOfPreviousCoordinates) {
            if (coord.equals(new Coordinates(x,y))){
                return true;
            }
        }
        return false;
    }
    public boolean compareWithExits(int x, int y, List<Coordinates> listOfExits){
        Coordinates coordinates = new Coordinates(x,y);
        for (Coordinates coord:listOfExits) {
            if (coord.equals(coordinates)){
                return true;
            }
        }
        return false;
    }
    public void deleteStepsWithoutLinkage(LinkedList<Coordinates> way){
        while (way.size()>1 && (!checkRight(way) && !checkLeft(way) && !checkUp(way) && !checkDown(way))){
            way.remove(way.size()-2);
        }
    }
    private boolean checkLeft(LinkedList<Coordinates> way){
        return way.getLast().getX() - 1 == way.get(way.size() - 2).getX() && way.getLast().getY() == way.get(way.size() - 2).getY();
    }
    private boolean checkRight(LinkedList<Coordinates> way){
        return way.getLast().getX() + 1 == way.get(way.size() - 2).getX() && way.getLast().getY() == way.get(way.size() - 2).getY();
    }
    private boolean checkUp(LinkedList<Coordinates> way){
        return way.getLast().getX() == way.get(way.size() - 2).getX() && way.getLast().getY() - 1 == way.get(way.size() - 2).getY();
    }
    private boolean checkDown(LinkedList<Coordinates> way){
        return way.getLast().getX() == way.get(way.size() - 2).getX() && way.getLast().getY() + 1 == way.get(way.size() - 2).getY();
    }
}
