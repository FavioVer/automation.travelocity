package com.travelocity.framework.exceptions;

import static java.lang.String.format;

public class CapabilitiesLoaderException extends RuntimeException {

    private static final String MESSAGE = "Unable to load capability file '%s'.";

    public CapabilitiesLoaderException(String file) {
        super(format(MESSAGE, file));
    }
}
