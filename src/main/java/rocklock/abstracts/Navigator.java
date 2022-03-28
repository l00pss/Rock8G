package rocklock.abstracts;

public interface Navigator <T>{

    StatefulWidget init();

    T pop();

    T push(T object);

}
