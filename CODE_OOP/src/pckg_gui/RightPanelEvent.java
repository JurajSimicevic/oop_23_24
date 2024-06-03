package pckg_gui;

import java.util.EventObject;

public class RightPanelEvent extends EventObject {
    private PurchaseData purchaseData;
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public RightPanelEvent(Object source) {
        super(source);
    }

    public RightPanelEvent(Object source, PurchaseData purchaseData) {
        super(source);
        this.purchaseData = purchaseData;
    }

    public PurchaseData getPurchaseData() {
        return purchaseData;
    }
}
