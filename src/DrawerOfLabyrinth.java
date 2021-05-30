import java.util.List;

public class DrawerOfLabyrinth implements Drawer {
    @Override
    public void draw(List<List<Character>> labyrinth) {
        for (int i = 0; i < labyrinth.size(); i++) {
            for (int j = 0; j < labyrinth.get(0).size(); j++) {
                System.out.print(labyrinth.get(i).get(j));
            }
            System.out.println();
        }
    }
}
