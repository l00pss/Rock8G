package exception.abstracts;

public class AbstractMainException extends Exception{
    public AbstractMainException(){
        super("Bilinməyən xəta :( ");
    }
    public AbstractMainException(final String message){
        super(message);
    }
}
