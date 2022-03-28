package rocklock.concretes;

import rocklock.abstracts.Navigator;
import rocklock.abstracts.StatefulWidget;

import java.util.Stack;

public class GNavigator<T> implements Navigator<T> {

    private final Stack<T> stack = new Stack<>();

    public GNavigator(){}

    public GNavigator(T item){
        stack.push(item);
    }


    @Override
    public StatefulWidget init() {
        return null;
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T push(T item) {
        return this.stack.push(item);
    }


}
