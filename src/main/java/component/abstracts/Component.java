package component.abstracts;

import java.io.IOException;

@FunctionalInterface
public interface Component {
    void init() throws IOException;
}