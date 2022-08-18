package com.example.test.pages.KBBMOOCProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarForSaleConditionTabComponent extends KbbPageBase{

    public CarForSaleConditionTabComponent(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    private WebElement conditionTab = keyword.findElement(By.xpath("//span[contains(text(),'Condition')]"));
    private WebElement optionNew = keyword.findElement(By.xpath("(//div[normalize-space()='New'])[1]"));
    private WebElement optionUsed = keyword.findElement(By.xpath("(//div[normalize-space()='Used'])[1]"));
    private WebElement optionManufacturerCertified = keyword.findElement(By.xpath("//div[normalize-space()='Manufacturer Certified']"));
    private WebElement optionThirdPartyCertified = keyword.findElement(By.xpath("//div[contains(text(),'Third-Party Certified')]"));

    /**
     * Method verify that Year Tab is displayed Correct
     * @return true or false
     */
    public boolean isTheConditionFilterShouldBeDisplayedCorrectWhenUserClickOnIt(){
        keyword.scrollToElement(conditionTab);
        if (isElementDisplayed(optionNew) == true && isElementDisplayed(optionManufacturerCertified) == true && 
        isElementDisplayed(optionThirdPartyCertified) == true && isElementDisplayed(optionUsed))
        {
            return true;
        }
        else return false;
    }
    /**
     * Wait for loading page to check title next page
     * @throws InterruptedException
     */
/**
 * Click on ConditionTab expanded and click on option New
 * @throws InterruptedException
 */
    public void clickOnConditionTab()throws InterruptedException{

        keyword.waitForPageToLoad();
        keyword.scrollAndWaitToClick(optionNew);
        
    } 

}
