package pckg_gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeftPanel extends JPanel {

    private JTextField nameField;
    private JTextField cityField;
    private JTextField mailField;
    private JButton sendDataBtn;
    private FormPanelListener formPanelListener;


    public LeftPanel() {


        Dimension dims = getPreferredSize();
        dims.width = 250;
        dims.height = 300;
        setPreferredSize(dims);
        decoratePanel();
        initComps();
        layoutComps();
        activatePanel();
    }

    private void decoratePanel() {

        Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border inner = BorderFactory.createTitledBorder("Customer data: ");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);
    }

    private void initComps() {

        nameField = new JTextField(10);
        cityField = new JTextField(10);
        mailField = new JTextField(10);
        sendDataBtn = new JButton("Send data");
    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.weightx = 0.1;
        add(new JLabel("Name:"), gbc);

        gbc.gridy++;
        add(nameField, gbc);

        gbc.gridy++;
        add(new JLabel("City:"), gbc);

        gbc.gridy++;
        add(cityField, gbc);

        gbc.gridy++;
        add(new JLabel("Mail:"), gbc);

        gbc.gridy++;
        add(mailField, gbc);

        gbc.weighty = 0.25;
        gbc.gridy++;
        add(sendDataBtn, gbc);
    }

    private void activatePanel() {

        sendDataBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(formPanelListener != null) {
                    String name = nameField.getText();
                    String city = cityField.getText();
                    String mail = mailField.getText();
                    Customer customer = new Customer(name, city, mail);
                    formPanelListener.leftPanelEventOccured(new LeftPanelEvent(this, customer));
                    resetLeftForm();
                } else {
                    //JOption name
                }
            }
        });
    }

    private void resetLeftForm(){
        nameField.setText(null);
        cityField.setText(null);
        mailField.setText(null);
        nameField.requestFocus();
    }

    public void setFormPanelListener(FormPanelListener formPanelListener) {

        this.formPanelListener = formPanelListener;
        System.out.println(formPanelListener);
    }
}
