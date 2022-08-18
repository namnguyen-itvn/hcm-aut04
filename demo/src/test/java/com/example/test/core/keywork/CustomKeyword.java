package com.example.test.core.keywork;

import java.util.List;

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
     * Wait to element visible
     *
     * @param locator: By.xpath or By.cssSelector...
     * @return element to be located
     */
    public WebElement findElement(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

     /**
     * Wait for element clickable
     *
     * @param webElement
     * @return
     */
    public WebElement waitForElementClickable(WebElement webElement) {
        return wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    /*
     * wait for element visibilities in page
     */
    public WebElement waitForElementVisibilities(WebElement webElement) {
        return wait.until(ExpectedConditions.visibilityOf(webElement));
    }

     /**
     * wait element display
     *
     * @param wElement
     * @return
     */
    public WebElement waitForElementIsDisplay(WebElement wElement) {
        return wait.until(ExpectedConditions.visibilityOf(wElement));
    }

    /**
     * Wait to element visible
     *
     * @param element: By.xpath or By.cssSelector...
     * @return element to be located
     */
    public WebElement findElement(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
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
     * Wait to locator of element visible
     * Keyword to find list element
     *
     * @param locator: By.xpath or By.cssSelector...
     * @return element to be located
     */
    public WebElement findElementByLocator(By locator) {
        return driver.findElement(locator);
    }
    public List<WebElement> findElements(By locator)
    {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    /**
     * Keyword for get text of element
     *
     * @param webElement: element to get text
     * @return: keyword to get text from element
     */
    public String getText(WebElement webElement) {
        scrollToElement(webElement);
        return waitForElementVisibilities(webElement).getText();
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
     * Options for select value
     */
    public enum chooseTypeOfSelect {
        selectByValue,
        selectByVisibleText,
        selectByIndex
    }

    /**
     * set value for Element by Select
     *
     * @param webElement element to set value
     * @param type       type of select element (e.g selectByValue,
     *                   selectByVisibleText, selectByIndex)
     * @param value      value of element
     * @return CustomKeyword to set value for element
     */
    public CustomKeyword setValueForSelectElement(WebElement webElement, chooseTypeOfSelect type, String value) {
        Select ddlElement = new Select(waitForElementClickable(webElement));
        switch (type) {
            case selectByValue:
                ddlElement.selectByValue(value);
                break;
            case selectByVisibleText:
                ddlElement.selectByVisibleText(value);
                break;
            case selectByIndex:
                ddlElement.selectByIndex(Integer.parseInt(value));
                break;
        }
        return new CustomKeyword(driver, wait);
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
        return new CustomKeyword(driver, wait);
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
    public void wait(WebElement element) throws InterruptedException{
        Thread.sleep(5000);

    }

      /**
     * Scroll And Wait To Click
     * @param element
     * @return
     * @throws InterruptedException
     */
    public CustomKeyword scrollAndWaitToClick1(WebElement element) throws InterruptedException {
        try{
            scrollToElemtnIntoView(element);
            waitForElementDisplayed(element);
         // ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-50)");
            element.click();
           // Thread.sleep(5000);
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
        Thread.sleep(4000);
    }
}
