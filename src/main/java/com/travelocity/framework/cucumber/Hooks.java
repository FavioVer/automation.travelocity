package com.travelocity.framework.cucumber;

import com.travelocity.framework.ui.driver.Drivers;
import com.travelocity.framework.ui.platform.Platform;
import com.travelocity.framework.ui.server.SeleniumStandaloneServer;
import com.travelocity.framework.utils.ConfigUtils;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

public class Hooks {

    private static boolean firstRun = true;

    @Before
    public void before() throws MalformedURLException {
        if (firstRun) {
            Runtime.getRuntime().addShutdownHook(afterAllThread());
            if (Platform.WEB.equals(ConfigUtils.getPlatform())) {
                SeleniumStandaloneServer.SERVER.start();
            }
            firstRun = false;
        }
        Drivers.populateDriver(ConfigUtils.getPlatform(), ConfigUtils.getBrowser());

    }

    private Thread afterAllThread() {
        return new Thread(() -> {
            if (Platform.WEB.equals(ConfigUtils.getPlatform())) {
                SeleniumStandaloneServer.SERVER.stop();
            }
        });
    }
}
