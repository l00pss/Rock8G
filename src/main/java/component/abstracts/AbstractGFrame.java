package component.abstracts;

import com.formdev.flatlaf.FlatLaf;
import factory.abstracts.*;
import frames.widgets.MainMenuBar;
import frames.widgets.TopPanel;
import utility.concretes.ThemeChanger;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class AbstractGFrame extends JFrame {

    private FlatLaf flatLightLaf;
    private MainMenuBar  mainMenuBar;
    private TopPanel topPanel;

    private final AbstractComponentFactory componentFactory;
    private final AbstractLayoutFactory layerFactory;
    private final AbstractWindowsFactory windowsFactory;


    {
        componentFactory = (AbstractComponentFactory) FactoryManager.COMPONENT.get();
        layerFactory = (AbstractLayoutFactory) FactoryManager.LAYOUT.get();
        windowsFactory = (AbstractWindowsFactory) FactoryManager.WINDOWS.get();
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

    {
        topPanel = new TopPanel();
        topPanel.init();
        this.add(topPanel,BorderLayout.NORTH);
    }

    public AbstractGFrame() {
    }
}
