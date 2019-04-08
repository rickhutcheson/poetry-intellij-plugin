package com.oddlyaccurate.poetryplugin.services;

import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.components.StoragePathMacros;
import org.jetbrains.annotations.NotNull;

/** File-based implementation of the PoetryConfigService */
@State(name = "PoetryPlugin", storages = @Storage(StoragePathMacros.MODULE_FILE))
public class SimplePoetryConfigService implements PoetryConfigService {
    private PoetryConfigService.State state = new PoetryConfigService.State();

    @NotNull
    public State getState() {
        return this.state;
    }

    public void loadState(@NotNull State state) {
        this.state = state;
    }
}
