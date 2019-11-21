package com.travelocity.framework.utils;

import com.travelocity.framework.configuration.ConfigFile;
import com.travelocity.framework.logger.Loggable;
import com.travelocity.framework.ui.browser.Browsers;

import static java.lang.System.getProperty;
import static java.lang.System.getenv;

public class ConfigUtils implements Loggable {

    // Environment variable names
    private static final String ENVIRONMENT = "environment";
    private static final String DEFAULT_ENVIRONMENT = "automation";
    private static final String PLATFORM = "platform";
    private static final String BROWSER = "browser";

    private ConfigUtils() {
    }

    private static String get(String key) {
        String environment = getProperty(key);
        if (environment == null) {
            environment = getenv(key);
        }
        return environment;
    }

    public static String getConfigFileNameByType(ConfigFile fileType) {
        return String.format("%s-%s", fileType.getValue(), getEnvironment());
    }

    public static String getEnvironment() {
        return get(ENVIRONMENT) == null ? DEFAULT_ENVIRONMENT : get(ENVIRONMENT);
    }


    public static Browsers getBrowser() {
        return get(BROWSER) == null ? Browsers.CHROME : Browsers.valueOf(get(BROWSER).toUpperCase());
    }
}