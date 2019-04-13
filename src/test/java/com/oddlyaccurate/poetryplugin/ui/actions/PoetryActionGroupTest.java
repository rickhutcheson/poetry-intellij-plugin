package com.oddlyaccurate.poetryplugin.ui.actions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PoetryActionGroupTest {

    @Test
    public void testPoetryActionGroupContents () {
        PoetryActionGroup pag = new PoetryActionGroup();
        assertEquals(pag.getChildren(null).length, 5);
    }
}
