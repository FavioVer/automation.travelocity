package com.travelocity.framework.webdriver;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources("file:src/test/resources/webdriver.config")
public interface WebdriverConfig extends Config {

    @Key("webdriver.browser")
    @DefaultValue("firefox")
    String browser();

    @Key("webdriver.geckodriver")
    String geckoDriver();

    @Key("webdriver.chromedriver")
    String chromeDriver();

    @Key("webdriver.internetexplorerdriver")
    String InternetExplorerDriver();

    @Key("reportConfigPath")
    String reportConfigPath();

}
