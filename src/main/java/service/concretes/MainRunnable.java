package service.concretes;

import frames.MainFrame;
import rockDI.annotation.Injection;
import rockDI.annotation.Node;
import rockDI.annotation.RockField;
import service.abstracts.Rock8GRunnableApplication;
import utility.abstracts.Theme;
import utility.concretes.ThemeLoader;


@RockField
public class MainRunnable implements Rock8GRunnableApplication {
    private final Theme theme = new ThemeLoader();

    @Injection
    private MainFrame mainFrame;

    {
        theme.load();
    }

    @Override
    public void run() {
       mainFrame.init();
    }
}
