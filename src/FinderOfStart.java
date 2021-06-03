import java.awt.*;

public class FinderOfStart {
    public Coordinates find(MyButtons buttons) {
        Coordinates coordinatesOfStart = null;
        for (int i = 0; i < buttons.getButtons().length; i++) {
            for (int j = 0; j < buttons.getButtons()[0].length; j++) {
                if (buttons.getButtons()[i][j].getBackground().equals(Color.RED)){
                    coordinatesOfStart = new Coordinates(j,i);
                }
            }
        }
        return coordinatesOfStart;
    }
}
