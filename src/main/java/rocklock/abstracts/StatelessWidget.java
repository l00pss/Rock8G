package rocklock.abstracts;

import rocklock.abstracts.BuilderContext;
import rocklock.concretes.Widget;

public abstract class StatelessWidget extends Widget {
    abstract Widget build(BuilderContext context);
}
