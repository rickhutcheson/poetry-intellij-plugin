package com.oddlyaccurate.poetryplugin.ui.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class PoetryAddAction extends AnAction {

    public PoetryAddAction() {
        super("Add", "Add Dependency", null);
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent anActionEvent) {
        // Using the event, create and show a dialog
    }
}
