import javax.swing.*;

public class MyButtons extends JButton {
    private final JButton[][] buttons;

    public MyButtons(JButton[][] buttons) {
        this.buttons = buttons;
    }

    public JButton[][] getButtons() {
        return buttons;
    }
}
