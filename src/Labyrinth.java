import java.util.List;

public class Labyrinth {
    private final List<List<Character>> content;

    public Labyrinth(String address) {
        Reader reader = new LabyrinthReader();
        this.content = reader.read(address);
    }
    public List<List<Character>> getContent(){
        return content;
    }
}
