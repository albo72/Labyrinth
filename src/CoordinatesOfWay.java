import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CoordinatesOfWay {
    private final List<LinkedList> content;

    public CoordinatesOfWay(Labyrinth labyrinth, int x, int y) {
        Runner runner = new Runner();
        PossibleExits exits = new PossibleExits(labyrinth);
        List<Coordinates> listOfPreviousCoordinates = new ArrayList<>();
        LinkedList<Coordinates> steps = new LinkedList<>();
        List<LinkedList> way = new ArrayList<>();
        if (labyrinth.getContent().get(y).get(x).equals('.')) {
            this.content = runner.moveAndGetTheWay(x, y, labyrinth, exits, listOfPreviousCoordinates, steps, way);
        } else {
            this.content = null;
        }
    }

    public List<LinkedList> getContent() {
        return content;
    }


    @Override
    public String toString() {
        if (content.size() == 0) {
            return "Выхода нет...";
        }
        if (content.size() == 1) {
            return "Путь из указанной точки по координатам (x:y):\n" + content.get(0);
        }
        String line = "Есть несколько вариантов пути к выходу по координатам (x:y):\n";
        for (int i = 0; i < content.size(); i++) {
            if (i != content.size() - 1) {
                line = line + content.get(i) + "\n";
            } else {
                line = line + content.get(i);
            }
        }
        return line;
    }
}
