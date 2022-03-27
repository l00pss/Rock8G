package component.abstracts;

import com.formdev.flatlaf.FlatLaf;
import frames.widgets.MainMenuBar;
import utility.concretes.ThemeChanger;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class AbstractGFrame extends JFrame {

    private FlatLaf flatLightLaf;
    private MainMenuBar  mainMenuBar;

    {
        try {
            this.setTitle("Rock8G");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            this.getContentPane().setBackground(Color.DARK_GRAY);
            this.setIconImage(ImageIO.read(new File("src/main/java/icon/5R.png")));
            flatLightLaf = ThemeChanger.DRACULA.get();
            UIManager.setLookAndFeel (flatLightLaf);
            this.setVisible(true);
        } catch (IOException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame("Error"),e.getMessage());
        }
    }

    {
        mainMenuBar = new MainMenuBar();
        mainMenuBar.init();
        this.setJMenuBar(mainMenuBar);
    }

}
