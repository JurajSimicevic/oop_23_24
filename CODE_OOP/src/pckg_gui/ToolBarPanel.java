package pckg_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBarPanel extends JPanel implements ActionListener {

    private JButton setTextBtn;
    private JButton resetViewPanelBtn;
    private ToolBarListener toolBarListener;

    public ToolBarPanel() {

        initToolBar();
        initComponents();
        layoutComps();
        activateToolBar();
    }

    private void activateToolBar() {
        setTextBtn.addActionListener(this);
        resetViewPanelBtn.addActionListener( this);
        setTextBtn.setText("Set Text");
        resetViewPanelBtn.setActionCommand("RESET");
    }

    private void layoutComps() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(setTextBtn);
        add(resetViewPanelBtn);
    }

    private void initComponents() {
        setTextBtn = new JButton("Set Text");
        resetViewPanelBtn = new JButton("Reset view panel");
    }

    private void initToolBar() {

    }

    public void setToolBarListener(ToolBarListener toolBarListener) {
        this.toolBarListener = toolBarListener;
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(setTextBtn) && toolBarListener != null) {
            toolBarListener.toolBarEventOccured(new ToolBarEvent(this, setTextBtn.getActionCommand()));
            System.out.println(setTextBtn.getActionCommand());
        }

        if(ae.getSource().equals(resetViewPanelBtn) && toolBarListener != null) {
            toolBarListener.toolBarEventOccured(new ToolBarEvent(this, resetViewPanelBtn.getActionCommand()));
            System.out.println(resetViewPanelBtn.getActionCommand());
        }
    }
}
