import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Labyrinth labyrinth = new Labyrinth("C:\\Users\\Alex\\Desktop\\Java\\Labyrinth\\src\\1.in");
        Drawer drawer = new DrawerOfLabyrinth();
        drawer.draw(labyrinth.getLabyrinth());
        Searcher searcher = new SearherOfPossibleExits();
        System.out.println(searcher.search(labyrinth.getLabyrinth()));
        Runner runner = new Runner();
        Map<Integer,Integer> way = new HashMap<>();
        runner.moveAndGetTheWay(6,1,labyrinth.getLabyrinth(),way);
//        System.out.println(runner.moveAndGetTheWay(7,1,labyrinth.getLabyrinth(),new HashMap<>()));

    }
}
