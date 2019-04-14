package com.oddlyaccurate.poetryplugin.ui.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.oddlyaccurate.poetryplugin.ui.actions.forms.PoetryRemoveForm;
import org.jetbrains.annotations.NotNull;

public class PoetryRemoveAction extends AnAction {

    public PoetryRemoveAction() {
        super("Remove a dependency", "Remove a dependency from your environment", null);
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent anActionEvent) {
        PoetryRemoveForm removeForm = new PoetryRemoveForm();
        removeForm.setVisible(true);
    }
}
