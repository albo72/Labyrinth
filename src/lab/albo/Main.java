package lab.albo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Reader reader = new LabyrinthReader();
        Labyrinth labyrinth = new Labyrinth(reader.read("C:\\Users\\Alex\\Desktop\\Java\\Labyrinth\\src\\4.in"));
        Drawer drawer = new DrawerOfLabyrinth();
        drawer.draw(labyrinth);
        CreatorOfButtons creatorOfButtons = new CreatorOfButtons();
        ButtonsOfLabyrinth buttons = new ButtonsOfLabyrinth(creatorOfButtons.createArrayOfLabyrinthButtons(labyrinth));
        CreatorOfFrame creatorOfFrame = new CreatorOfFrame();
        JFrame frame = creatorOfFrame.create(buttons);
        WayFinderInFrame wayFinder2 = new WayFinderInFrame();
        wayFinder2.findWay(buttons, labyrinth);
    }
}
