package pckg_gui;

import javax.swing.*;
import java.awt.*;

public class FormPanel extends JPanel {

    private LeftPanel leftPanel;
    private RightPanel rightPanel;
    private FormPanelListener formPanelListener;


    public FormPanel() {

        initComps();
        layoutComps();
        activateForm();
    }

    private void activateForm() {

    }

    private void layoutComps() {

        setLayout(new BorderLayout());
        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.CENTER);

    }

    private void initComps() {

        leftPanel = new LeftPanel();
        rightPanel = new RightPanel();
    }

    public void setFormPanelListener(FormPanelListener formPanelListener) {
        this.formPanelListener = formPanelListener;
        System.out.println("Form panel listener: " + formPanelListener);
        leftPanel.setFormPanelListener(formPanelListener);
        rightPanel.setFormPanelListener(formPanelListener);
    }


}
