package lab.albo;

import java.util.List;

public class PossibleExits {
    private final List<Coordinates> content;

    public PossibleExits(List<Coordinates> content) {
        this.content = content;
    }

    public List<Coordinates> getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Возможные выходы по координатам (x:y): " + content;
    }
}
