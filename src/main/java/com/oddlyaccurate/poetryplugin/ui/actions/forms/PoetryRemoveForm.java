package com.oddlyaccurate.poetryplugin.ui.actions.forms;

import javax.swing.*;

public class PoetryRemoveForm extends JFrame {
    private JPanel removePanel;
    private JPanel labels;
    private JPanel fields;
    private JPanel buttons;
    private JButton okButton;
    private JButton cancelButton;
    private JTextField removeField;

    public PoetryRemoveForm() {
        add(removePanel);
        setTitle("Add a dependency");
        setSize(350, 100);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
