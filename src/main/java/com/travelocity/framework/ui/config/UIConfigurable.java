package com.travelocity.framework.ui.config;

import com.travelocity.framework.configuration.Configurable;

public interface UIConfigurable extends Configurable {

    public String getRemoteServerURL();

    public String getAppiumURL();

    public Integer getImplicitWait();

    public Integer getExplicitWait();

    public Integer getPollingEvery();

    public Integer getPageLoadTimeout();

    public Integer getScriptTimeout();
}
