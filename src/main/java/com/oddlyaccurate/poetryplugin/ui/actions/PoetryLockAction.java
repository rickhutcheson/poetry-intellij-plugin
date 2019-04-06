package com.oddlyaccurate.poetryplugin.ui.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class PoetryLockAction extends AnAction {

    public PoetryLockAction() {
        super("Lock", "Update Poetry Lock File", null);
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent anActionEvent) {
        // Using the event, create and show a dialog
    }
}
