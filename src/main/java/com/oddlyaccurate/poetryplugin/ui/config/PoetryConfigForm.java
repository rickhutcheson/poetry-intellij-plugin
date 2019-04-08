package com.oddlyaccurate.poetryplugin.ui.config;

import com.oddlyaccurate.poetryplugin.services.PoetryConfigService;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * Our "data binding" for the poetry config form in PoetryConfigForm.form
 * Instantiated with a PoetryConfigService.State instance, it provides access
 * to a new instance with any changes from the user applied.
 */
public final class PoetryConfigForm {
    /** contains state object with any mutations a user has caused */
    @NotNull private PoetryConfigService.State newState;

    private JTextField pathField;
    private JPanel rootComponent;

    PoetryConfigForm(PoetryConfigService.State currentState) {
        // Setup state
        newState = currentState.clone();

        // Setup listeners
        setupPathField();
    }


    /*
     * Data interaction
     */


    /** @return a copy of the current state values as the user has modified them */
    @NotNull
    PoetryConfigService.State getNewState() {
        return this.newState.clone();
    }

    /** @return the root component to render this form */
    JPanel getRootComponent() {
        return rootComponent;
    }


    /*
     * UI Configuration
     */


    /** Sets listeners for path field */
    private void setupPathField() {
        pathField.setText(newState.poetryPath);

        // update state values when user hits enter
        pathField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                newState.poetryPath = pathField.getText();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                newState.poetryPath = pathField.getText();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                newState.poetryPath = pathField.getText();
            }
        });
    }

}
