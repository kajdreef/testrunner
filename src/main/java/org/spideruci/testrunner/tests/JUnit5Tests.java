package org.spideruci.testrunner.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnit5Tests {
    @Test
    public void testIfTrueIsTrue() {
        assertTrue(true);
    }

    @Test
    public void testIfFalseIsFalse() {
        assertFalse(false);
    }
}
