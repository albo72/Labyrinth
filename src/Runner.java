import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner {
    public Map<Integer, Integer> moveAndGetTheWay(int x, int y, List<List<Character>> labyrinth,Map<Integer,Integer> way) {

        if (labyrinth.get(y).get(x-1).equals('.')){
            x=x-1;
            way.put(y,x);
            System.out.println(way);
            moveAndGetTheWay(x, y, labyrinth,way);
        } else if (labyrinth.get(y+1).get(x).equals('.')){
            y=y+1;
            way.put(y,x);
            System.out.println(way);
            moveAndGetTheWay(x, y, labyrinth,way);
        }
        return way;
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