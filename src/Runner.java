import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Runner {
    public List<LinkedList> moveAndGetTheWay(int x, int y, Labyrinth labyrinth,List<Coordinates> listOfExits, List<Coordinates> listOfPreviousCoordinates,LinkedList<Coordinates> way, List<LinkedList> way2) {
        Coordinates coordinates = new Coordinates(x,y);
        listOfPreviousCoordinates.add(coordinates);
        way.addLast(coordinates);
        checkNextStep(x,y,way);
        if (labyrinth.getContent().get(y).get(x-1).equals('.') && !checkPreviousSteps(x-1,y,listOfPreviousCoordinates)){
            if (!checkExits(x-1,y,listOfExits)) {
                moveAndGetTheWay(x - 1, y, labyrinth, listOfExits, listOfPreviousCoordinates, way, way2);
            }
            else {
                way.addLast(new Coordinates(x-1,y));
                checkNextStep(x,y,way);
                way2.add((LinkedList) way.clone());
            }
        }
        if (labyrinth.getContent().get(y).get(x+1).equals('.') && !checkPreviousSteps(x+1,y,listOfPreviousCoordinates)){
            if (!checkExits(x+1,y,listOfExits)) {
                moveAndGetTheWay(x + 1, y, labyrinth, listOfExits, listOfPreviousCoordinates, way, way2);
            }
            else {
                way.addLast(new Coordinates(x+1,y));
                checkNextStep(x,y,way);
                way2.add((LinkedList) way.clone());
            }
        }
        if (labyrinth.getContent().get(y+1).get(x).equals('.') && !checkPreviousSteps(x,y+1,listOfPreviousCoordinates)){
            if (!checkExits(x,y+1,listOfExits)) {
                moveAndGetTheWay(x, y+1, labyrinth, listOfExits, listOfPreviousCoordinates, way, way2);
            }
            else {
                way.addLast(new Coordinates(x,y+1));
                checkNextStep(x,y,way);
                way2.add((LinkedList) way.clone());
            }
        }
        if (labyrinth.getContent().get(y-1).get(x).equals('.') && !checkPreviousSteps(x,y-1,listOfPreviousCoordinates)){
            if (!checkExits(x,y-1,listOfExits)) {
                moveAndGetTheWay(x, y-1, labyrinth, listOfExits, listOfPreviousCoordinates, way, way2);
            }
            else {
                way.addLast(new Coordinates(x,y-1));
                checkNextStep(x,y,way);
                way2.add((LinkedList) way.clone());
            }
        }
        return way2;
    }
    private boolean checkPreviousSteps(int x, int y, List<Coordinates> listOfPreviousCoordinates){
        for (Coordinates coord:listOfPreviousCoordinates) {
            if (coord.equals(new Coordinates(x,y))){
                return true;
            }
        }
        return false;
    }
    private boolean checkExits(int x, int y, List<Coordinates> listOfExits){
        Coordinates coordinates = new Coordinates(x,y);
        for (Coordinates coord:listOfExits) {
            if (coord.equals(coordinates)){
                return true;
            }
        }
        return false;
    }
    private void checkNextStep(int x, int y, LinkedList<Coordinates> way){
        while (way.size()>1 && (!checkRight(way) && !checkLeft(way) && !checkUp(way) && !checkDown(way))){
            way.remove(way.size()-2);
        }
    }
    private boolean checkLeft(LinkedList<Coordinates> way){
        if(way.getLast().getX()-1 == way.get(way.size()-2).getX() && way.getLast().getY() == way.get(way.size()-2).getY()){
            return true;
        }
        return false;
    }
    private boolean checkRight(LinkedList<Coordinates> way){
        if(way.getLast().getX()+1 == way.get(way.size()-2).getX() && way.getLast().getY() == way.get(way.size()-2).getY()){
            return true;
        }
        return false;
    }
    private boolean checkUp(LinkedList<Coordinates> way){
        if(way.getLast().getX() == way.get(way.size()-2).getX() && way.getLast().getY()-1 == way.get(way.size()-2).getY()){
            return true;
        }
        return false;
    }
    private boolean checkDown(LinkedList<Coordinates> way){
        if(way.getLast().getX() == way.get(way.size()-2).getX() && way.getLast().getY()+1 == way.get(way.size()-2).getY()){
            return true;
        }
        return false;
    }
}