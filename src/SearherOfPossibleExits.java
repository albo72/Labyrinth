import java.util.ArrayList;
import java.util.List;

public class SearherOfPossibleExits implements Searcher {
    @Override
    public List<Coordinates> search(Labyrinth labyrinth) {
        List<Coordinates> possibleExits = new ArrayList<>();
        for (int i = 0; i < labyrinth.getContent().size(); i++) {
            for (int j = 0; j < labyrinth.getContent().get(0).size(); j++) {
                if (i == 0 || i == labyrinth.getContent().size() - 1) {
                    if ((labyrinth.getContent().get(i).get(j)).equals('.')) {
                        Coordinates coordinates = new Coordinates(j,i);
                        possibleExits.add(coordinates);
                    }
                } else if (j == 0 || j == labyrinth.getContent().get(0).size() - 1) {
                    if ((labyrinth.getContent().get(i).get(j)).equals('.')) {
                        Coordinates coordinates = new Coordinates(j,i);
                        possibleExits.add(coordinates);
                    }
                }
            }
        }
        return possibleExits;
    }
}
