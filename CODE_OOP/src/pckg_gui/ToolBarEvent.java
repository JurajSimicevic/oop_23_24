package pckg_gui;

import java.util.EventObject;

public class ToolBarEvent extends EventObject {

    private String someString;

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ToolBarEvent(Object source) {
        super(source);
    }

    public ToolBarEvent(Object parent, String someString){
        super(parent);
        this.someString = someString;
    }

    public String getSomeString() {
        return someString;
    }
}
