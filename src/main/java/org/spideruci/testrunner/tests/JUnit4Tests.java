package org.spideruci.testrunner.tests;

import org.junit.Test;
import static org.junit.Assert.*;

public class JUnit4Tests {
    @Test
    public void testIfTrueIsTrue() {
        assertTrue(true);
    }

    @Test
    public void testIfFalseIsFalse() {
        assertFalse(false);
    }
}
