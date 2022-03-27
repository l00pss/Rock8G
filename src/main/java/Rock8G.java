import service.abstracts.Rock8GRunnableApplication;
import service.concretes.MainRunnable;
import exception.GExceptionPane;

public class Rock8G {

    private static final Rock8GRunnableApplication application = new MainRunnable();

    public static void main(String[] args) {

        try {
            application.run();
        }catch (Exception exception){
            new GExceptionPane();
        }

    }
}
