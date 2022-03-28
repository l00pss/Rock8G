package rocklock.abstracts;

import rocklock.concretes.State;
import rocklock.concretes.Widget;

public abstract class StatefulWidget<T extends StatefulWidget<T>> extends Widget {

    abstract State<T> createState();

}
