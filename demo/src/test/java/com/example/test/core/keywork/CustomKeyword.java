package com.example.test.core.keywork;

import java.util.List;
import java.util.concurrent.TimeUnit;

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
        throw new Exception("url not start with http or http. Double check baseUrl");
    }

    /**
     * Wait for Element displayed and input text
     * @param element
     * @param text
     */
    public void sendKeys(WebElement element, String text){
        try{
            waitForElementIsDisplayed(element).sendKeys(text);
        }catch(WebDriverException ex){
            throw new WebDriverException("Element not availabe to input text!");
        }
    }

    /**
     * find element by css selector
     * 
     * @param locator element locator
     * @return element to be located
     */
    public WebElement findElementByCssSelector(String locator) {
        try{
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
        } catch (WebDriverException e) {
            throw new WebDriverException("Element is not displayed ");
        }
    }

    /**
     * Scroll to element and find element by xpath
     * @param locator
     * @return
     */
    public WebElement findWebElementByXpath(String locator){
        try{
            return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
        } catch(WebDriverException ex ){
            throw new WebDriverException("Element not found!");
        }
    }

    /**
     * Scroll to element and find element by xpath
     * @param locator
     * @return
     */
    public List<WebElement> findListWebElementByXpath(String locator){
        try{
            return driver.findElements(By.xpath(locator));
        } catch(WebDriverException ex ){
            throw new WebDriverException("Elements not found!");
        }
    }

    /**
     * Scroll/Move to element
     * 
     * @param element to find in page
     */
    public void scrollToElement(WebElement element){

        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", element);
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Check element is display :v
     * 
     * @param element
     * @return
     */
    public boolean isDisplay(WebElement element){
        return waitForElementIsDisplayed(element).isDisplayed();
    }

    /**
     * Wait to element visible
     * 
     * @param element to check display and clickable 
     * @return element to be located
     */
    public WebElement waitForElementIsDisplayed(WebElement element){
        try {
            return wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (WebDriverException e) {
            throw new WebDriverException("Element is not displayed ");
        }
    }

    /**
     * Check place holder equal given text or not
     * 
     * @param element
     * @return
     */
    public boolean checkPlaceHolder(WebElement element, String text){
        String attribute = waitForElementIsDisplayed(element).getAttribute("placeholder");
        return (attribute.equals(text));
    }

    /**
     * Click to element
     * 
     * @param element to click
     */
    public CustomKeyword click(WebElement element){
        Actions actions = new Actions(this.driver);
        actions.moveToElement(element).build().perform();
        waitForElementIsDisplayed(element).click();
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
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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

    public WebElement findWebElementByCSS(String locator){
        try{
            scrollToElemtnIntoView(driver.findElement(By.cssSelector(locator)));
            return wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator)));
        } catch(WebDriverException ex ){
            throw new WebDriverException("CSS not found!");
        }
    }

    public void waitForPageToLoad() throws InterruptedException
    {
        Thread.sleep(4000);
    }

    public void scrollToTopOfPage()
    {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    }
}
