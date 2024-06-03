package pckg_gui;

import javax.swing.*;
import java.awt.*;

public class ViewPanel extends JPanel {

    private JTextArea textArea;
    private JScrollPane scrollPane;

    public ViewPanel(){

        initViewPanel();
        initComps();
        layoutComps();
    }

    private void layoutComps() {

        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
    }

    private void initComps() {
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    }

    private void initViewPanel() {
        Dimension dims = getPreferredSize();
        dims.height = 230;
        setPreferredSize(dims);
    }

    public void setText(String someString){

        textArea.append(someString+"\n");
    }

    public void resetViewPanel() {

        textArea.selectAll();
        textArea.replaceSelection(null);
        textArea.requestFocus();
    }
}
