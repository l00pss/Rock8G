package exception.abstracts;

public abstract class AbstractInitException extends AbstractMainException  {
    public AbstractInitException(){
    }
    public AbstractInitException(final String message){
        super(message);
    }
}
