package pckg_gui;

import java.util.EventListener;

public interface FormPanelListener extends EventListener {

    void leftPanelEventOccured(LeftPanelEvent leftPanelEvent);
    void rightPanelEventOccured(RightPanelEvent rightPanelEvent);
}
