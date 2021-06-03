import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Reader reader = new LabyrinthReader();
        Labyrinth labyrinth = new Labyrinth(reader.read("C:\\Users\\Alex\\Desktop\\Java\\Labyrinth\\src\\5.in"));
        Drawer drawer = new DrawerOfLabyrinth();
        drawer.draw(labyrinth);
        PossibleExits exits = new PossibleExits(labyrinth);
        System.out.println(exits);
        CoordinatesOfWay wayToExit = new CoordinatesOfWay(labyrinth, 2, 1);
        System.out.println(wayToExit);
        /*Finder wayFinder = new WayFinder();
        Way showWay = new Way(wayFinder.find(labyrinth,wayToExit));
        drawer.draw(showWay.getWayFromLabyrinth());
        drawer.draw(labyrinth);*/
        CreatorOfButtons creatorOfButtons = new CreatorOfButtons();
        MyButtons buttons = new MyButtons(creatorOfButtons.createArrayOfLabyrinthButtons(labyrinth));
        CreatorOfFrame creatorOfFrame = new CreatorOfFrame();
        JFrame frame = creatorOfFrame.create(buttons);
        FinderOfStart finderOfStart = new FinderOfStart();
        Coordinates coordinatesOfStart = finderOfStart.find(buttons);
        WayFinder2 wayFinder2 = new WayFinder2();
        wayFinder2.findWay(buttons,coordinatesOfStart,labyrinth);
    }
}
