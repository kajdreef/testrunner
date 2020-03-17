package org.spideruci.testrunner.tests;

import junit.framework.TestCase;

import static junit.framework.Assert.*;

public class JUnit3Tests extends TestCase {
    public void test_IfTrueIsTrue() {
        assertTrue(true);
    }

    public void test_IfFalseIsFalse() {
        assertFalse(false);
    }
}
