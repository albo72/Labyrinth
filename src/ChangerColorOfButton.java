import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ChangerColorOfButton extends AbstractAction {
    private final JButton button;

    public ChangerColorOfButton(JButton button) {
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setBackground(Color.RED);
    }
}
