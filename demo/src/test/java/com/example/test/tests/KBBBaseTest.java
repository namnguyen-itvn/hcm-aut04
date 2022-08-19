package com.example.test.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.example.test.core.drivers.DriverManager;
import com.example.test.core.helper.ReadConfigPropertyFile;
import com.example.test.core.report.ReportListener;


@Listeners(ReportListener.class)
public class KBBBaseTest {
    public WebDriver driver;
    String baseUrl = ReadConfigPropertyFile.getPropertyValue("urlForWhatMyCarWorth");
    String browser = ReadConfigPropertyFile.getPropertyValue("browser");
    @BeforeTest
    public void setUp() throws Exception{
        this.driver = DriverManager.getDriver(browser);
        driver.get(baseUrl);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
