package com.example.test.core.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverSetup implements SeleniumDriver {

    private ChromeOptions options;
    private DesiredCapabilities capabilities;

    private ChromeOptions getOptions(){
        if(options == null){
            options = new ChromeOptions();
            options.addArguments("start-maximized");
            options.setAcceptInsecureCerts(true);
            options.addArguments("src\\test\\java\\com\\example\\test\\core\\drivers\\adblock_1_42_4_0_chrome.crx");
        }
        return options;
    }

    private DesiredCapabilities getCapabilities(){
        if(this.capabilities == null){
            this.capabilities = DesiredCapabilities.chrome();
            this.capabilities.setJavascriptEnabled(true);
            this.capabilities.setAcceptInsecureCerts(true);
        }
        return capabilities;
    }

    @Override
    public WebDriver createDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(getOptions().merge(getCapabilities()));
    }

    @Override
    public void setDriverOption(Object options) {
        this.options = ((ChromeOptions) options);
    }

    @Override
    public void setCapabilities(Object capabilities) {
        this.capabilities = ((DesiredCapabilities) capabilities);
        
    }
}
