package com.oddlyaccurate.poetryplugin.ui.actions.forms;

import javax.swing.*;

public class PoetryAddForm extends JFrame {
    private JPanel addPanel;
    private JButton okButton;
    private JButton cancelButton;
    private JTextField nameField;
    private JTextField versionField;
    private JPanel labels;
    private JPanel buttons;
    private JPanel fields;

    public PoetryAddForm() {
        add(addPanel);
        setTitle("Add a dependency");
        setSize(325, 125);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
