import java.util.List;

public class PossibleExits {
    private final List<Coordinates> content;

    public PossibleExits(Labyrinth labyrinth) {
        SearherOfPossibleExits searher = new  SearherOfPossibleExits();
        this.content = searher.search(labyrinth);
    }

    public List<Coordinates> getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Возможные выходы по координатам (x:y): " + content;
    }
}
