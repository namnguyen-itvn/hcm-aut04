package com.example.test.core.drivers;


import org.openqa.selenium.WebDriver;

public class DriverManager {
    public static WebDriver getDriver(String browser) throws Exception {
        switch(browser){
            case "CHROME":
                return new ChromeDriverSetup1().createDriver();
            case "FIREFOX":
                return new FirefoxBrowserSetup().createDriver();
            default:
                throw new Exception("Driver not found. Double check project driver source!");
        }
    }
    private static WebDriver driver;

    
    public static WebDriver getDriver() {
        return driver;
    }
}
