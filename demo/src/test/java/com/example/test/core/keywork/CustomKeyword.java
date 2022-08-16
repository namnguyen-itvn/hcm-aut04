package com.example.test.core.keywork;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomKeyword {
    private WebDriver driver;
    private WebDriverWait wait;

    public CustomKeyword(WebDriver driver, WebDriverWait wait) {
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
     * @throws InterruptedException
     */
    public void sendKeys(WebElement element, String text) throws InterruptedException{
        try{
            waitForElementDisplayed(element).sendKeys(text);
            Thread.sleep(4000);
        }catch(WebDriverException ex){
            throw new WebDriverException("Element not availabe to input text!");
        }
    }

    /**
     * Scroll And Wait To Click
     * @param element
     * @return
     * @throws InterruptedException
     */
    public CustomKeyword scrollAndWaitToClick(WebElement element) throws InterruptedException {
        try{
            waitForElementDisplayed(element);
            element.click();
            Thread.sleep(4000);
            return new CustomKeyword(driver, wait);
        }catch(WebDriverException ex){
            throw new WebDriverException("Element not availabe to click!");
        }
    }

    /**
     * Wait To Click
     * @param element
     * @return
     * @throws InterruptedException
     */
    public CustomKeyword waitToClick(WebElement element) throws InterruptedException {
        try{
            waitForElementDisplayedWithoutScroll(element);
            element.click();
            Thread.sleep(5000);
            return new CustomKeyword(driver, wait);
        }catch(WebDriverException ex){
            throw new WebDriverException("Element not availabe to click!");
        }
    }

}