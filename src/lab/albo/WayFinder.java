package lab.albo;

public class WayFinder implements Finder {
    @Override
    public Labyrinth find(Labyrinth labyrinth, CoordinatesOfWay way) {
        Labyrinth newLabyrinth = new Labyrinth(labyrinth.getContent());
        for (int i = 0; i < way.getContent().size(); i++) {
            for (int j = 0; j < way.getContent().get(i).size(); j++) {
                int y = ((Coordinates) way.getContent().get(i).get(j)).getY();
                int x = ((Coordinates) way.getContent().get(i).get(j)).getX();
                labyrinth.getContent().get(y).remove(x);
                labyrinth.getContent().get(y).add(x, '*');
            }
        }
        return newLabyrinth;
    }
}
