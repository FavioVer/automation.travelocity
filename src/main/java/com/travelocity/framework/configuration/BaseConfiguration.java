package com.travelocity.framework.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseConfiguration implements Configuration {

    @JsonProperty
    private String baseURL = "";

    @Override
    public String getBaseURL() {
        return baseURL;
    }
}
