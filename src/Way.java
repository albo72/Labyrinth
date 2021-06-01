public class Way {
    private final Labyrinth wayFromLabyrinth;

    public Way(Labyrinth labyrinth, int x, int y) {
        Finder steps = new Wayfinder();
        CoordinatesOfWay coordinates = new CoordinatesOfWay(labyrinth, x, y);
        Labyrinth newLabyrinth = steps.find(labyrinth, coordinates);
        this.wayFromLabyrinth = newLabyrinth;
    }

    public Labyrinth getWayFromLabyrinth() {
        return wayFromLabyrinth;
    }
}
