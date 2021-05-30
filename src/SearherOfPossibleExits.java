import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearherOfPossibleExits implements Searcher {
    @Override
    public List<Coordinates> search(List<List<Character>> labyrinth) {
        List<Coordinates> possibleExits = new ArrayList<>();
        for (int i = 0; i < labyrinth.size(); i++) {
            for (int j = 0; j < labyrinth.get(0).size(); j++) {
                if (i == 0 || i == labyrinth.size() - 1) {
                    if ((labyrinth.get(i).get(j)).equals('.')) {
                        Coordinates coordinates = new Coordinates(j,i);
                        possibleExits.add(coordinates);
                    }
                } else if (j == 0 || j == labyrinth.get(0).size() - 1) {
                    if ((labyrinth.get(i).get(j)).equals('.')) {
                        Coordinates coordinates = new Coordinates(j,i);
                        possibleExits.add(coordinates);
                    }
                }
            }
        }
        return possibleExits;
    }
}
