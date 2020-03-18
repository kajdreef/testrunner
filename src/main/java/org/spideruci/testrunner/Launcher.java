package org.spideruci.testrunner;


import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

public class Launcher {
    private TestExecutionListener summaryListener;
    private TestRunner runner;

    public Launcher() {
        this.summaryListener = new SummaryGeneratingListener();

        this.runner = new TestRunner()
            .select("org.spideruci.testrunner.tests")
            .registerListener(this.summaryListener)
            .registerListener(new ExampleTestListener());
    }

    public Launcher run() {
        runner.runTests();
        return this;
    }

    public void report(){
        TestExecutionSummary summary = ((SummaryGeneratingListener) summaryListener).getSummary();
        System.out.println("Total of tests started: " + summary.getTestsStartedCount());
        System.out.println("Total of tests succeeded: " + summary.getTestsSucceededCount());
        System.out.println("Total of tests failed: " + summary.getTestsFailedCount());
    }

    public static void main(String[] args){
        new Launcher().run().report();
    }
}