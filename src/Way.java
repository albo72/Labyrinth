import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Way {
    private final List<LinkedList> content;
    public Way(Labyrinth labyrinth, int x, int y) {
        Runner runner = new Runner();
        SearherOfPossibleExits possibleExitsExits = new SearherOfPossibleExits();
        List<Coordinates> exits = possibleExitsExits.search(labyrinth);
        List<Coordinates> listOfPreviousCoordinates = new ArrayList<>();
        LinkedList<Coordinates> steps = new LinkedList<>();
        List<LinkedList> way = new ArrayList<>();
        if (labyrinth.getContent().get(y).get(x).equals('.')) {
            this.content = runner.moveAndGetTheWay(x, y, labyrinth, exits, listOfPreviousCoordinates, steps, way);
        }else {
            this.content = null;
        }
    }

    public List<LinkedList> getContent() {
        return content;
    }

    @Override
    public String toString() {
        if(content.size()==0){
            return "Выхода нет...";
        }
        if(content.size()==1){
            return "Путь из указанной точки:" + content;
        }
        return "Есть несколько вариантов пути к выходу:" + content;
    }
}
