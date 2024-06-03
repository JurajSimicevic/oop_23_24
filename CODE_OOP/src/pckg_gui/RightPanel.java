package pckg_gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RightPanel extends JPanel {

    private FormPanelListener formPanelListener;
    private JList<String> categoryList;
    private JComboBox<String> paymentCombo;

    private JCheckBox decorateChck;
    private JCheckBox giftCardChck;
    private JCheckBox specialGiftChck;

    private JRadioButton expressDelivery;
    private JRadioButton normalDelivery;
    private ButtonGroup radioBtnGroup;

    private JButton confirmBtn;

    private JScrollPane listScrollPane;

    public RightPanel() {
        decorate();
        initComp();
        layoutComps();
        activatePanel();
    }
    private void activatePanel() {

        confirmBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(formPanelListener != null) {
                    String payment = (String)paymentCombo.getSelectedItem();
                    String category = categoryList.getSelectedValue();
                    String delivery = radioBtnGroup.getSelection().getActionCommand();
                    boolean giftCard = giftCardChck.isSelected();
                    boolean giftBox = decorateChck.isSelected();
                    boolean specialGift = specialGiftChck.isSelected();
                    PurchaseData purchaseData = new PurchaseData(category, payment, delivery, giftCard, giftBox, specialGift);
                    formPanelListener.rightPanelEventOccured(new RightPanelEvent(this, purchaseData));
                }
            }
        });
    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;;
        gbc.gridy = 0;
        gbc.anchor  = GridBagConstraints.FIRST_LINE_START;

        add(new JLabel("Product Cat.:"), gbc);
        gbc.gridy++;
        add(listScrollPane, gbc);

        gbc.gridy++;
        add(Box.createVerticalStrut(35), gbc);

        gbc.gridy++;
        add(giftCardChck, gbc);
        gbc.gridy++;
        add(decorateChck, gbc);
        gbc.gridy++;
        add(specialGiftChck, gbc);

        gbc.gridy = 0;
        gbc.gridx++;
        add(Box.createHorizontalStrut(20), gbc);

        gbc.gridx++;
        add(new JLabel("Payment method:"), gbc);

        gbc.gridy++;
        add(paymentCombo, gbc);

        gbc.gridy = 0;
        gbc.gridx++;

        add(Box.createHorizontalStrut(20), gbc);

        gbc.gridx++;
        add(normalDelivery,gbc);
        gbc.gridy++;
        add(expressDelivery, gbc);

        gbc.gridy += 4;
        add(confirmBtn, gbc);


    }

    private void initComp() {
        categoryList = new JList<>();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.add(0, "CAT-1");
        listModel.add(1, "CAT-2");
        listModel.add(2, "CAT-3");
        listModel.add(3, "CAT-4");
        listModel.add(4, "CAT-5");
        categoryList.setVisibleRowCount(3);
        categoryList.setModel(listModel);
        listScrollPane = new JScrollPane(categoryList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        listScrollPane.setPreferredSize(new Dimension(100, 70));
        giftCardChck = new JCheckBox("Gift Card");
        decorateChck = new JCheckBox("Decorative box");
        specialGiftChck = new JCheckBox("Special gift");

        paymentCombo = new JComboBox<>();
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        comboBoxModel.addElement(null);
        comboBoxModel.addElement("Cash");
        comboBoxModel.addElement("VISA");
        comboBoxModel.addElement("AMERICAN");
        comboBoxModel.addElement("PayPal");
        comboBoxModel.addElement("MASTER");
        comboBoxModel.addElement("Bitcoin");
        paymentCombo.setModel(comboBoxModel);

        expressDelivery = new JRadioButton("Express Delivery");
        expressDelivery.setActionCommand("Express delivery");
        normalDelivery = new JRadioButton("Normal delivery");
        normalDelivery.setActionCommand("Normal delivery");
        radioBtnGroup = new ButtonGroup();
        radioBtnGroup.add(expressDelivery);
        radioBtnGroup.add(normalDelivery);
        normalDelivery.setSelected(true);

        confirmBtn = new JButton("Confirm");

    }

    private void decorate() {
        Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border inner = BorderFactory.createTitledBorder("Purchase data:");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);
    }

    public void setFormPanelListener(FormPanelListener formPanelListener) {

        this.formPanelListener = formPanelListener;
    }
}
