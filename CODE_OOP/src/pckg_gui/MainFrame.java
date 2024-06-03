package pckg_gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private ToolBarPanel toolBar;
    private ViewPanel viewPanel;
    private FormPanel formPanel;


    public MainFrame(){
        super("Simple form title");

        initMainFrame();
        initComponents();
        layoutComponents();
        activateMainFrame();
    }

    private void activateMainFrame(){

        toolBar.setToolBarListener(new ToolBarListener() {
            @Override
            public void toolBarEventOccured(ToolBarEvent toolBarEvent) {
                String someString = toolBarEvent.getSomeString();
                if(someString.equals("SET TEXT")){
                    viewPanel.setText(someString);
                }

                if(someString.equals("RESET")){
                    viewPanel.resetViewPanel();
                }
            }
        });

        formPanel.setFormPanelListener(new FormPanelListener() {
            @Override
            public void leftPanelEventOccured(LeftPanelEvent leftPanelEvent) {
                Customer customer = leftPanelEvent.getCustomer();
                viewPanel.setText(customer.toString());
            }

            @Override
            public void rightPanelEventOccured(RightPanelEvent rightPanelEvent) {
                PurchaseData purchaseData = rightPanelEvent.getPurchaseData();
                viewPanel.setText(purchaseData.toString());
            }
        });
    }

    private void layoutComponents() {
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(toolBar, BorderLayout.NORTH);
        add(formPanel, BorderLayout.SOUTH);
    }

    private void initComponents(){

        toolBar = new ToolBarPanel();
        viewPanel = new ViewPanel();
        formPanel = new FormPanel();
    }

    private void initMainFrame(){
        setSize(680,580);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
