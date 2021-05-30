import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner {
    public List<Coordinates> moveAndGetTheWay(int x, int y, Labyrinth labyrinth,Map<Integer,Integer> way) {


        return null;
    }
    public boolean checkConnection(int x, int y, Map<Integer,Integer> mapOfPreviousSteps){
        for (int key:mapOfPreviousSteps.keySet()) {
            if (key==y && mapOfPreviousSteps.get(y)==x){
                return true;
            }
        }
        return false;
    }
    public Map<Integer,Integer> save(int x, int y,Map<Integer,Integer> way){
        way.put(y,x);
        return way;
    }
}