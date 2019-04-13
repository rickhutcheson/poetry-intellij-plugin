package com.oddlyaccurate.poetryplugin.services;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

/**
 * Represents the current per-project configuration that the user has chosen for Poetry.
 * It provides access to this state through the `getState()` and `loadState()` methods.
 *
 * The state will be stored at some persistent location specified by the implementation.
 *
 * @see SimplePoetryConfigService
 */
public interface PoetryConfigService extends PersistentStateComponent<PoetryConfigService.State> {
    static PoetryConfigService getInstance(@NotNull Project project) {
        return ServiceManager.getService(project, PoetryConfigService.class);
    }

    /**
     * Represents a actual project configuration of the poetry plugin.
     */
    final class State implements Cloneable {
        /** The path to the desired poetry binary */
        @NotNull public String poetryPath = "";

        @Override
        public PoetryConfigService.State clone() {
            try {
                return (PoetryConfigService.State) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();  // absolutely can't happen
            }
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!obj.getClass().equals(this.getClass())) {
                return false;
            }

            PoetryConfigService.State otherState = (PoetryConfigService.State)obj;
            return poetryPath.equals(otherState.poetryPath);
        }
    }

    /** Get the current configuration state */
    @NotNull State getState();

    void loadState(@NotNull State state);

}
