package com.example.test.tests.KBBMOOCProject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.example.test.core.drivers.DriverManager;
import com.example.test.core.helper.ReadConfigPropertyFile;
import com.example.test.core.keywork.CustomKeyword;

public class KbbBaseTest {
    
    public WebDriver driver;
    public CustomKeyword keyword;
    public String baseUrl = ReadConfigPropertyFile.getPropertyValue("url");
    public String browser = ReadConfigPropertyFile.getPropertyValue("browser");
    
    @BeforeTest
    public void setUp() throws Exception{
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
