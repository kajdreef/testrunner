package org.spideruci.testrunner;


import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

public class Launcher {
    private TestExecutionListener listener;
    private TestRunner runner;

    public Launcher() {
        this.listener = new SummaryGeneratingListener();
        this.runner = new TestRunner()
            .select("org.spideruci.testrunner.tests");
    }

    public Launcher run() {
        runner.runTests(listener);
        return this;
    }

    public void report(){
        TestExecutionSummary summary = ((SummaryGeneratingListener) listener).getSummary();
        System.out.println("Total of tests started: " + summary.getTestsStartedCount());
        System.out.println("Total of tests succeeded: " + summary.getTestsSucceededCount());
        System.out.println("Total of tests failed: " + summary.getTestsFailedCount());
    }

    public static void main(String[] args){
        new Launcher().run().report();
    }
}