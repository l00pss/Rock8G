package service.concretes;

import frames.MainFrame;
import service.abstracts.Rock8GRunnableApplication;
import utility.abstracts.Theme;
import utility.concretes.ThemeLoader;



public class MainRunnable implements Rock8GRunnableApplication {
    private final Theme theme = new ThemeLoader();

    private final MainFrame frame = new MainFrame();

    {
        theme.load();
    }

    @Override
    public void run() {
       frame.init();
    }
}
