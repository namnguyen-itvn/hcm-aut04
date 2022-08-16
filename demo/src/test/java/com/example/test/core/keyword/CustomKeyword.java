package com.example.test.core.keyword;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomKeyword {
    private WebDriver driver;
    private WebDriverWait wait;

    public CustomKeyword(WebDriver driver,WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    
    /**
     * Scroll to element and find element by classname
     * @param locator
     * @return
     */
    public WebElement findWebElementByClassName(String element){
        try{
            scrollToElemtnIntoView(driver.findElement(By.className(element)));
            return wait.until(ExpectedConditions.presenceOfElementLocated(By.className(element)));
        } catch(WebDriverException ex ){
            throw new WebDriverException("Element not found!");
        }
    }

    /**
     * Scroll to element and find element by css
     * @param locator
     * @return
     */
    public WebElement findWebElementByCSS(String element){
        try{
            scrollToElemtnIntoView(driver.findElement(By.cssSelector(element)));
            return wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(element)));
        } catch(WebDriverException ex ){
            throw new WebDriverException("Element not found!");
        }
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
        throw new Exception("url not start with http or http. Double check baseUrl");
    }

    /**
     * Scroll to element and find element by xpath
     * @param locator
     * @return
     */
    public WebElement findWebElementByXpath(String element){
        try{
            scrollToElemtnIntoView(driver.findElement(By.xpath(element)));
            return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(element)));
        } catch(WebDriverException ex ){
            throw new WebDriverException("Element not found!");
        }
    }

    /**
     * Scroll to element and find element by xpath
     * @param locator
     * @return
     */
    public WebElement findWebElementById(String element){
        try{
            scrollToElemtnIntoView(driver.findElement(By.id(element)));
            return wait.until(ExpectedConditions.presenceOfElementLocated(By.id(element)));
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

    /**
     * Wait for Element displayed and input text
     * @param element
     * @param text
     * @throws InterruptedException
     */
    public void sendKeys(WebElement element, String text) throws InterruptedException{
        try{
            waitForElementDisplayed(element).sendKeys(text);
            Thread.sleep(5000);
        }catch(WebDriverException ex){
            throw new WebDriverException("Element not availabe to input text!");
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
     * Scroll And Wait To Click
     * @param element
     * @return
     * @throws InterruptedException
     */
    public CustomKeyword scrollAndWaitToClick(WebElement element) throws InterruptedException {
        try{
            scrollToElemtnIntoView(element);
            waitForElementDisplayed(element);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)");
            element.click();
            Thread.sleep(5000);
            return new CustomKeyword(driver, wait);
        }catch(WebDriverException ex){
            throw new WebDriverException("Element not availabe to click!");
        }
    }

    /**
     * Wait To Click
     * @param element
     * @return
     */
    public CustomKeyword waitToClick(WebElement element) {
        try{
            waitForElementDisplayedWithoutScroll(element);
            element.click();
            return new CustomKeyword(driver, wait);
        }catch(WebDriverException ex){
            throw new WebDriverException("Element not availabe to click!");
        }
    }
    public void waitForPageToLoad() throws InterruptedException
    {
        Thread.sleep(5000);
    }


}
