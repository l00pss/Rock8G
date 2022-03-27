package exception.concretes;

import exception.abstracts.AbstractInitException;
public final class MainInitException extends AbstractInitException {
    public MainInitException(){
        super();
    }
    public MainInitException(final String message){
        super(message);
    }
}
