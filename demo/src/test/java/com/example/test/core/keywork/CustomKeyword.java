package com.example.test.core.keywork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomKeyword {
    private WebDriver driver;
    private WebDriverWait wait;

    public CustomKeyword(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
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
     * Wait for Element displayed and input text
     * @param element
     * @param text
     */
    public void sendKeys(WebElement element, String text){
        try{
            waitForElementDisplayed(element).sendKeys(text);
        }catch(WebDriverException ex){
            throw new WebDriverException("Element not availabe to input text!");
        }
    }

    /**
     * Wait To Click
     * @param element
     * @return
     * @throws InterruptedException
     */

    public CustomKeyword click(WebElement element){
        Actions actions = new Actions(this.driver);
        actions.moveToElement(element).build().perform();
        waitForElementDisplayed(element).click();
        return new CustomKeyword(driver,wait);
    }



    public WebElement findWebElementByID(String locator){
        try{
            scrollToElemtnIntoView(driver.findElement(By.id(locator)));
            return wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));
        } catch(WebDriverException ex ){
            throw new WebDriverException("Element not found!");
        }
    }

    /**
     * Scroll to element into View
     * @param element
     */
    public void scrollToElemtnIntoView(WebElement element){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollUp()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
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
     * Scroll And Wait To Click
     * @param element
     * @return
     * @throws InterruptedException
     */
    public CustomKeyword scrollAndWaitToClick(WebElement element) throws InterruptedException {
        try{
            scrollToElemtnIntoView(element);
            waitForElementDisplayed(element);
            element.click();
            return new CustomKeyword(driver, wait);
        }catch(WebDriverException ex){
            throw new WebDriverException("Element not availabe to click!");
        }
    }

    public void implicitWait()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public CustomKeyword waitToClick(WebElement element) throws InterruptedException {
        try{
            waitForElementDisplayedWithoutScroll(element);

            element.click();
            return new CustomKeyword(driver, wait);
        }catch(WebDriverException ex){
            throw new WebDriverException("Element not availabe to click!");
        }
    }


    public WebElement findWebElementByClass(String locator){
        try{
            scrollToElemtnIntoView(driver.findElement(By.className(locator)));
            return wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locator)));
        } catch(WebDriverException ex ){
            throw new WebDriverException("ClassName not found!");
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

}
