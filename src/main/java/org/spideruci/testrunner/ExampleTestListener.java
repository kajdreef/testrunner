package org.spideruci.testrunner;

import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;

public class ExampleTestListener implements TestExecutionListener {

    public void executionStarted(TestIdentifier testIdentifier) {
        if (testIdentifier.isTest()) {
            System.out.println("Test was started: " + testIdentifier.getDisplayName());
        }
        else if (testIdentifier.isContainer()) {
            System.out.println("Entering container: " + testIdentifier.getDisplayName());
        }
    }

    public void executionFinished(TestIdentifier testIdentifier, TestExecutionResult testExecutionResult) {
        if (testIdentifier.isTest()) {
            System.out.println("Finished " + testIdentifier.getDisplayName() +  " - " + testExecutionResult.toString());
        }
        else if (testIdentifier.isContainer()){
            System.out.println("Leaving " + testIdentifier.getDisplayName());
        }
    }
}