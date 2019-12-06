package com.travelocity.framework.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.StringUtils;

public class BaseConfiguration implements Configurable {

    @JsonProperty("baseURL")
    private String baseURL = StringUtils.EMPTY;

    @Override
    @JsonProperty("baseURL")
    public String getBaseURL() {
        return baseURL;
    }
}
