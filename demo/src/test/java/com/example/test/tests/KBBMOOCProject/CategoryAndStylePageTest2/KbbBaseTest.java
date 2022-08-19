package com.example.test.tests.KBBMOOCProject.CategoryAndStylePageTest2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.example.test.core.drivers.DriverManager;
import com.example.test.core.helper.ReadConfigPropertyFileCategoryAndStylePage2;
import com.example.test.core.keyword.CustomKeywordForCategoryAndStylePage;

public class KbbBaseTest {
    
    public WebDriver driver;
    public CustomKeywordForCategoryAndStylePage keyword;
    public String pathChromeDriver = "src\\test\\java\\com\\example\\test\\resources\\driver\\chromedriver.exe";
    public String baseUrl = ReadConfigPropertyFileCategoryAndStylePage2.getPropertyValue("urlforwhatmycarworth");
    public String browser = ReadConfigPropertyFileCategoryAndStylePage2.getPropertyValue("browser");
    
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
