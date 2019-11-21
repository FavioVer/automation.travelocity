package com.travelocity.framework.exceptions;

import static java.lang.String.format;

public class ConfigLoaderException extends RuntimeException {

    private static final String MESSAGE = "Unable to load configuration file. Details: \n '%s'.";

    public ConfigLoaderException(String file) {
        super(format(MESSAGE, file));
    }
}
