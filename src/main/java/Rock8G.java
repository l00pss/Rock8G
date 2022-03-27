import rockDI.annotation.RockDI;
import rockDI.context.concretes.AbstractRockContext;
import rockDI.context.concretes.AnnotatedContext;
import service.abstracts.Rock8GRunnableApplication;
import service.concretes.MainRunnable;
import exception.GExceptionPane;

@RockDI
public class Rock8G {

    private static final AbstractRockContext abstractRockContext = new AnnotatedContext();


    private static final Rock8GRunnableApplication application = new MainRunnable();

    public static void main(String[] args) {

        try {
            abstractRockContext.execute();
            application.run();
        }catch (Exception exception){
            exception.printStackTrace();
            new GExceptionPane();
        }

    }
}
