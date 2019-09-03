package com.travelocity.framework.webdriver;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import com.travelocity.framework.tdm.EnvironmentProvider;
import com.travelocity.framework.utils.AutomationProperties;

public class Context {

    private String ENVIRONMENT = AutomationProperties.getString("environment").replaceAll(" ", "");

    private static Context instance;

    private Context() {
    }

    public static synchronized Context getInstance() {
        if (instance == null) {
            instance = new Context();
        }
        return instance;
    }
    
    public static String getEnvironment(){
        return getInstance().ENVIRONMENT;
    }
    
    public static void initializePageInstance(WebDriver driver, String app)
            throws EncryptedDocumentException, InvalidFormatException, IOException {
        driver.get(EnvironmentProvider.getUrl(app + "." + getEnvironment()));
        System.out.println("---");
        System.out.println("ENVIRONMENT: " + EnvironmentProvider.getUrl(getEnvironment()));
    }
}
