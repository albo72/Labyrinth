import java.util.List;

public class Labyrinth {
    private final List<List<Character>> content;

    public Labyrinth(List<List<Character>> content) {
        this.content = content;
    }

    public final List<List<Character>> getContent() {
        return content;
    }

}
