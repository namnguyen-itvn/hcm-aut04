package com.example.test.core.keywork;

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

    public CustomKeyword(WebDriver driver) {
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
        return new CustomKeyword(driver);
    }
}
