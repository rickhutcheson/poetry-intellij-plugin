package com.oddlyaccurate.poetryplugin.ui.actions;

import junit.framework.TestCase;

public class PoetryActionGroupTest extends TestCase {

    void testPoetryActionGroupContents () {
        PoetryActionGroup pag = new PoetryActionGroup();
        assertEquals(pag.getChildren(null).length, 5);
    }

    void testTravisFailsThisTest () {
        PoetryActionGroup pag = new PoetryActionGroup();
        assertEquals(pag.getChildren(null).length, 0);
    }
}
