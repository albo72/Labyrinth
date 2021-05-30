import java.util.*;

public class Main {
    public static void main(String[] args) {
        Labyrinth labyrinth = new Labyrinth("C:\\Users\\Alex\\Desktop\\Java\\Labyrinth\\src\\2.in");
        Drawer drawer = new DrawerOfLabyrinth();
        drawer.draw(labyrinth);
        Searcher searcher = new SearherOfPossibleExits();
        System.out.println(searcher.search(labyrinth));
        Runner runner = new Runner();
        List<Coordinates> list = new ArrayList<>();
        LinkedList<Coordinates> way = new LinkedList<>();
        List<LinkedList> way2 = new ArrayList<>();
//        runner.moveAndGetTheWay(5,3,labyrinth,list);
        System.out.println(runner.moveAndGetTheWay(1,1,labyrinth,searcher.search(labyrinth),list,way,way2));

    }
}
