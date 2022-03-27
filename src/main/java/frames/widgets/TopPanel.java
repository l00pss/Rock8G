package frames.widgets;

import component.abstracts.Component;
import exception.GExceptionPane;
import factory.abstracts.AbstractComponentFactory;
import factory.abstracts.FactoryManager;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class TopPanel extends JPanel implements Component {

    private final AbstractComponentFactory componentFactory;

    private Image iconNewProject;
    private Image iconOpenP;
    private Image iconGenerate;
    private Image iconSave;
    private Image iconRefactor;
    private Image iconEdit;
    private Image iconCloseTab;

    {
        try {
            iconNewProject = ImageIO.read(new File("src/main/java/icon/annotate_dark.png"));
            iconOpenP = ImageIO.read(new File("src/main/java/icon/folder.png"));
            iconGenerate = ImageIO.read(new File("src/main/java/icon/compile_dark.png"));
            iconSave = ImageIO.read(new File("src/main/java/icon/save.png"));
            iconRefactor = ImageIO.read(new File("src/main/java/icon/forceRefresh_dark.png"));
            iconEdit = ImageIO.read(new File("src/main/java/icon/edit.png"));
            iconCloseTab = ImageIO.read(new File("src/main/java/icon/cancel_dark.png"));
        } catch (IOException e) {
            new GExceptionPane();
        }
    }

    {
        componentFactory = (AbstractComponentFactory) FactoryManager.COMPONENT.get();
    }


    public void init()  {
        FlowLayout flowLayouts = new FlowLayout(FlowLayout.LEFT,5,5);
        this.setLayout(flowLayouts);

        JButton newFrameButton = componentFactory.factoryButton("New Frame");
        newFrameButton.setIcon(new ImageIcon(iconNewProject));
        newFrameButton.addActionListener((e)->{});

        JButton openProjectButton = componentFactory.factoryButton("Open");
        openProjectButton.setIcon(new ImageIcon(iconOpenP));

        JButton editButton = componentFactory.factoryButton("Edit");
        editButton.setIcon(new ImageIcon(iconEdit));

        JButton saveButton = componentFactory.factoryButton("Save");
        saveButton.setIcon(new ImageIcon(iconSave));

        JButton generate = componentFactory.factoryButton("Generate");
        generate.setIcon(new ImageIcon(iconGenerate));

        JButton refactor = componentFactory.factoryButton("Force Refresh");
        refactor.setIcon(new ImageIcon(iconRefactor));

        JButton closeTab = componentFactory.factoryButton("Close Tab");
        closeTab.setIcon(new ImageIcon(iconCloseTab));
        closeTab.addActionListener((e -> {

        }));

        this.add(newFrameButton);
        this.add(openProjectButton);
        this.add(editButton);
        this.add(saveButton);
        this.add(generate);
        this.add(refactor);
        this.add(closeTab);
    }
}