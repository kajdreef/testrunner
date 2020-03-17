package org.spideruci.testrunner.tests;

import static org.junit.Assert.*;

import org.testng.annotations.*;

public class TestNGTests { 

    @Test
    public void testIfTrueIsTrue() {
        assertTrue(true);
    }

    @Test
    public void testIfFalseIsFalse() {
        assertFalse(false);
    }
}