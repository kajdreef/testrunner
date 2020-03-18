package org.spideruci.testrunner;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectPackage;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;

public class TestRunner {
    private Launcher launcher;
    private LauncherDiscoveryRequest req;

    public TestRunner() {
        this.launcher = LauncherFactory.create();
        this.req = null;
    }

    public TestRunner select(String packageName) {
        this.req = LauncherDiscoveryRequestBuilder.request().selectors(
                selectPackage(packageName)
            )
            .build();

        return this;
    }

    public TestRunner registerListener(TestExecutionListener listener) {
        launcher.registerTestExecutionListeners(listener);
        return this;
    }

    public void runTests() {
        if (this.req == null) {
            System.out.println("configure request first");
        }
        else {
            launcher.execute(this.req);
        }
    }
}