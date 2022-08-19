package com.test.core.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrivenFactory {
    public static WebDriver getDriver(String browser) {
        switch(browser){
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            default:
                System.out.println("Browser " + browser +" is invalid. Should start chrome driver instead!");
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
        }
    }
}

