package com.oddlyaccurate.poetryplugin.ui.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.oddlyaccurate.poetryplugin.ui.actions.forms.PoetryAddForm;
import org.jetbrains.annotations.NotNull;

public class PoetryAddAction extends AnAction {

    public PoetryAddAction() {
        super("Add a dependency", "Add a new dependency to your environment", null);
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent anActionEvent) {
        PoetryAddForm addForm = new PoetryAddForm();
        addForm.setVisible(true);
    }
}
