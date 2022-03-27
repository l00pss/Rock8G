package exception;

import javax.swing.*;
import java.awt.*;

public class GExceptionPane extends JFrame {
    private JPanel panel = new JPanel();

    private final Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

    public GExceptionPane(){
        super("Error");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(dimension.width/2,dimension.height/2);
        this.setVisible(true);
    }
}
