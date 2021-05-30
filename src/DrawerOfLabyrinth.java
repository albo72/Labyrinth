import java.util.List;

public class DrawerOfLabyrinth implements Drawer {
    @Override
    public void draw(Labyrinth labyrinth) {
        for (int i = 0; i < labyrinth.getContent().size(); i++) {
            for (int j = 0; j < labyrinth.getContent().get(0).size(); j++) {
                System.out.print(labyrinth.getContent().get(i).get(j));
            }
            System.out.println();
        }
    }
}
