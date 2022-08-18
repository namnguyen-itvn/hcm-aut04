package com.example.test.tests.KBBMOOCProject.WhatsMyCarWorth;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.example.test.core.drivers.DriverManager;
import com.example.test.core.helper.ReadConfigPropertyFile;

public class KbbBaseTest {
    
    public WebDriver driver;
    String pathChromeDriver = "src\\test\\java\\com\\example\\test\\resources\\driver\\chromedriver.exe";
    // String pathChromeDriver = "src//test//java//com//example//test//resources//driver//chromedriver";
    String baseUrl = ReadConfigPropertyFile.getPropertyValue("url");
    String browser = ReadConfigPropertyFile.getPropertyValue("browser");
    
    @BeforeTest
    public void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver",pathChromeDriver);
        this.driver = DriverManager.getDriver(browser);
        driver.get(baseUrl);
    }

    /**
     * Common Function Any Page
     */


    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
