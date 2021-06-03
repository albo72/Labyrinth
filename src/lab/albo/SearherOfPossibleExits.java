package lab.albo;

import java.util.ArrayList;
import java.util.List;

public class SearherOfPossibleExits implements Searcher {
    @Override
    public List<Coordinates> search(Labyrinth labyrinth) {
        List<Coordinates> possibleExits = new ArrayList<>();
        for (int i = 0; i < labyrinth.getContent().size(); i++) {
            for (int j = 0; j < labyrinth.getContent().get(0).size(); j++) {
                if (isABorder(i, labyrinth.getContent().size())) {
                    ifNotWallThenAddCoord(labyrinth, i, j, possibleExits);
                } else if (isABorder(j, labyrinth.getContent().get(0).size())) {
                    ifNotWallThenAddCoord(labyrinth, i, j, possibleExits);
                }
            }
        }
        return possibleExits;
    }

    private boolean isABorder(int i, int size) {
        return i == 0 || i == size - 1;
    }

    private void ifNotWallThenAddCoord(Labyrinth labyrinth, int i, int j, List<Coordinates> possibleExits) {
        if ((labyrinth.getContent().get(i).get(j)).equals('.')) {
            Coordinates coordinates = new Coordinates(j, i);
            possibleExits.add(coordinates);
        }
    }
}
