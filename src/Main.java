public class Main {
    public static void main(String[] args) {
        Labyrinth labyrinth = new Labyrinth("C:\\Users\\Alex\\Desktop\\Java\\Labyrinth\\src\\2.in");
        Drawer drawer = new DrawerOfLabyrinth();
        drawer.draw(labyrinth);
        Searcher searcher = new SearherOfPossibleExits();
        System.out.println(searcher.search(labyrinth));
        Way wayToExit = new Way(labyrinth,1,1);
        System.out.println(wayToExit);
    }
}
