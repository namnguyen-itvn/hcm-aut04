package com.example.test.core.keyword;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomKeywordforwhatmycarworth {
    private WebDriver driver;
    private WebDriverWait wait;

    public CustomKeywordforwhatmycarworth(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    
    /**
     * Keyword for open url with checking if the url valid or not
     * @param baseUrl
     * @throws Exception
     */
    public void openUrl(String baseUrl) throws Exception {
        if(baseUrl.startsWith("http://") || baseUrl.startsWith("https://"))
        {
            driver.get(baseUrl);
        }
        throw new Exception("url not start with http or https. Double check baseUrl");
    }

    /**
     * Scroll to element and find element by xpath
     * @param locator
     * @return
     */
    public WebElement findWebElementByXpath(String locator){
        try{
            scrollToElemtnIntoView(driver.findElement(By.xpath(locator)));
            return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
        } catch(WebDriverException ex ){
            throw new WebDriverException("Element not found!");
        }
    }
    /**
     * Scroll to element and find element by classname
     * @param locator
     * @return
     */
    public WebElement findWebElementByClassName(String locator){
        try{
            scrollToElemtnIntoView(driver.findElement(By.className(locator)));
            return wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locator)));
        } catch(WebDriverException ex ){
            throw new WebDriverException("Element not found!");
        }
    }

    /**
     * Scroll to element and find element by css
     * @param locator
     * @return
     */
    public WebElement findWebElementByCSS(String locator){
        try{
            scrollToElemtnIntoView(driver.findElement(By.cssSelector(locator)));
            return wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator)));
        } catch(WebDriverException ex ){
            throw new WebDriverException("Element not found!");
        }
    }

    /**
     * Scroll to element into View
     * @param element
     */
    public void scrollToElemtnIntoView(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public WebElement waitForElementDisplayed(WebElement element) {
        try{
            scrollToElemtnIntoView(element);
            return wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch(WebDriverException ex){
            throw new WebDriverException("Element not displayed");
        }
        
    }

    //*wait without scroll */
    public WebElement waitForElementDisplayedWithoutScroll(WebElement element) {
        try{
            return wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch(WebDriverException ex){
            throw new WebDriverException("Element not displayed");
        }  
    }

    /**
     * Wait for Element displayed and input text
     * @param element
     * @param text
     * @
     */
    public void sendKeys(WebElement element, String text) {
        try{
            waitForElementDisplayed(element).sendKeys(text);
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        }catch(WebDriverException ex){
            throw new WebDriverException("Element not availabe to input text!");
        }
    }

    /**
     * Scroll And Wait To Click
     * @param element
     * @return
     * @
     */
    public CustomKeywordforwhatmycarworth scrollAndWaitToClick(WebElement element)  {
        try{
            waitForElementDisplayed(element);
            element.click();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            return new CustomKeywordforwhatmycarworth(driver, wait);
        }catch(WebDriverException ex){
            throw new WebDriverException("Element not availabe to click!");
        }
    }

    /**
     * Wait To Click
     * @param element
     * @return
     * @
     */
    public CustomKeywordforwhatmycarworth waitToClick(WebElement element)  {
        try{
            waitForElementDisplayedWithoutScroll(element);
            element.click();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            return new CustomKeywordforwhatmycarworth(driver, wait);
        }catch(WebDriverException ex){
            throw new WebDriverException("Element not availabe to click!");
        }
    }

}
