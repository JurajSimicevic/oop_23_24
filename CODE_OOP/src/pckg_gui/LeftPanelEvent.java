package pckg_gui;

import java.util.EventObject;

public class LeftPanelEvent extends EventObject {
    private Customer customer;
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public LeftPanelEvent(Object source) {
        super(source);
    }

    public LeftPanelEvent(Object source, Customer customer){
        super(source);
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
