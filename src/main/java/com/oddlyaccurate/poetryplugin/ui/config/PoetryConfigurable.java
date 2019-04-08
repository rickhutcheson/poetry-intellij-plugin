package com.oddlyaccurate.poetryplugin.ui.config;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.options.Configurable;
import com.oddlyaccurate.poetryplugin.services.PoetryConfigService;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Integrates configuration form with Intellij's settings UI.
 *
 * Allows rendering the form, and integrates with OK/Apply/Cancel buttons
 * using fields below.
 */
public class PoetryConfigurable implements Configurable {

    /** The form specific to this module */
    private PoetryConfigForm configForm;

    /** Our config service used for this module */
    private PoetryConfigService configService;

    public PoetryConfigurable(@NotNull Module module) {
        configService = PoetryConfigService.getInstance(module);
        configForm = new PoetryConfigForm(configService.getState());
    }

    @Nls(capitalization = Nls.Capitalization.Title)
    @Override
    @NotNull
    public String getDisplayName() {
        return "Poetry";
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        return configForm.getRootComponent();
    }

    @Override
    public boolean isModified() {
        if (configForm == null) {
            return false;
        }
        return !configForm.getNewState().equals(configService.getState());
    }

    @Override
    public void apply() {
        /* Check whether current stored path matches given path */
        configService.loadState(configForm.getNewState());
    }
}
