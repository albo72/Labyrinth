import java.util.List;

public class Labyrinth {
    private final List<List<Character>> labyrinth;

    public Labyrinth(String address) {
        Reader reader = new LabyrinthReader();
        this.labyrinth = reader.read(address);
    }
    public List<List<Character>> getLabyrinth(){
        return labyrinth;
    }
}
