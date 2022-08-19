package com.example.test.core.keywork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
     * @param element
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
        }catch(WebDriverException ex){
            throw new WebDriverException("Element not availabe to input text!");
        }
    }


    /**
     * Wait for Element displayed and input text
     * @param element
     * @param text
     * @throws InterruptedException
     */
    public void sendKeysAndWait(WebElement element, String text) throws InterruptedException{
        try{
            waitForElementDisplayed(element).sendKeys(text);
        }catch(WebDriverException ex){
            throw new WebDriverException("Element not availabe to input text!");
        }
    }
   
    //*wait without scroll */
    public WebElement waitForElementDisplayedWithoutScroll(WebElement element) throws InterruptedException {
        try{
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
    public CustomKeyword scrollAndWaitToClick(WebElement element)  {
        try{
            scrollToElemtnIntoView(element);
            waitForElementDisplayed(element);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)");
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
            return new CustomKeyword(driver, wait);
        }catch(WebDriverException ex){
            throw new WebDriverException("Element not availabe to click!");
        }
    }
    public void scrollByToClick(WebElement element) throws InterruptedException{
        try{
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,200)");
           
            element.click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }catch(WebDriverException ex){
            throw new WebDriverException("Element not availabe to input text!");
        }
    }
    public void argumentsByToClick(WebElement element) throws InterruptedException{
        try{
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("arguments[0].click()", element);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }catch(WebDriverException ex){
            throw new WebDriverException("Element not availabe to input text!");
        }
    }
    public void scrollBackToClick(WebElement element) throws InterruptedException{
        try{
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,0)");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            element.click();
            }catch(WebDriverException ex){
            throw new WebDriverException("Element not availabe to input text!");
        }
    }
    public void selectElement(WebElement element, String text) throws InterruptedException{
        try {
            //waitForElementDisplayed(element);
            Select select6=new Select(element);
            select6.selectByVisibleText(text);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }catch(WebDriverException ex){
            throw new WebDriverException("Element not availabe to input text!");
        }
 
    }
    public void click(WebElement element){
        try{
            waitForElementDisplayed(element);
            element.click();
        }catch(WebDriverException ex){
            throw new WebDriverException("Element not availabe to input text!");
        }

    }
  
}
