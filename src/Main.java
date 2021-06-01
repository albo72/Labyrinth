public class Main {
    public static void main(String[] args) {
        Labyrinth labyrinth = new Labyrinth("C:\\Users\\Alex\\Desktop\\Java\\Labyrinth\\src\\3.in");
        Drawer drawer = new DrawerOfLabyrinth();
        drawer.draw(labyrinth);
        PossibleExits exits = new PossibleExits(labyrinth);
        System.out.println(exits);
        CoordinatesOfWay wayToExit = new CoordinatesOfWay(labyrinth, 1, 1);
        System.out.println(wayToExit);
        Way showWay = new Way(labyrinth, 1,1);
        drawer.draw(showWay.getWayFromLabyrinth());

    }
}
