package com.example.test.core.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxBrowserSetup {
    private FirefoxOptions options;
    private DesiredCapabilities capabilities;

    private FirefoxOptions getOptions(){
        if(options == null){
            options = new FirefoxOptions();
            FirefoxProfile profile = new FirefoxProfile();
            profile.addExtension(new File("src\\test\\java\\com\\example\\test\\core\\drivers\\adblock_plus-3.13_firefox.xpi"));
            options.setProfile(profile);
            options.addArguments("start-maximized");
            options.setAcceptInsecureCerts(true);

        }
        return options;
    }

    private DesiredCapabilities getCapabilities(){
        if(this.capabilities == null){
            this.capabilities = DesiredCapabilities.firefox();
            this.capabilities.setJavascriptEnabled(true);
            this.capabilities.setAcceptInsecureCerts(true);
        }
        return capabilities;
    }

    public WebDriver createDriver(){
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver(getOptions().merge(getCapabilities()));
    }

    public void setDriverOption(Object options) {
        this.options = ((FirefoxOptions) options);
    }

    public void setCapabilities(Object capabilities) {
        this.capabilities = ((DesiredCapabilities) capabilities);
        
    }
}
