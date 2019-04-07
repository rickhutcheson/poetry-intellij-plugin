package com.oddlyaccurate.poetryplugin.ui.actions;

import com.intellij.openapi.actionSystem.ActionGroup;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


public class PoetryActionGroup extends ActionGroup {

    @NotNull
    @Override
    public AnAction[] getChildren(@Nullable AnActionEvent e) {

        return new AnAction[]{
                new PoetryAddAction(),
                new PoetryInstallAction(),
                new PoetryLockAction(),
                new PoetryRemoveAction(),
                new PoetryShowAction()
        };
    }
}
