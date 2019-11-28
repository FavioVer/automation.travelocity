package com.travelocity.framework.configuration;

import com.travelocity.framework.exceptions.DirOrFileNotFoundException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ExecutionPropertiesProvider {

    private static Properties properties;

    private static Properties getInstance() throws IOException {
        if (properties == null) {
            properties = new Properties();
            InputStream input = ExecutionPropertiesProvider.class.getClassLoader()
                    .getResourceAsStream("automation.properties");
            try {
                properties.load(input);
            } catch (NullPointerException | FileNotFoundException e) {
                throw new DirOrFileNotFoundException(e.getMessage());
            }
        }
        return properties;
    }

    public static String getString(String propertyName) throws IOException {
        if (System.getProperty(propertyName) != null && !System.getProperty(propertyName).isEmpty()) {
            return System.getProperty(propertyName);
        } else {
            return getInstance().getProperty(propertyName);
        }
    }

}
