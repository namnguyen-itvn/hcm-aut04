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
    private WebElement titleModuleYourSearch = keyword.findElement(By.xpath("//span[@class='text-size-400 text-bold text-gray-base']"));

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
     * Check Three element is Displayed
     * 
     * @return
     */
    public boolean checkOptionIsDisplayedCorrect() {
        keyword.scrollToElement(titleModuleYourSearch);
        WebElement optionConditionYourSearch = keyword.findElement(By.xpath(
                "//div[@class='chip btn input-chip display-inline-flex align-items-center margin-right-2 margin-bottom-2 text-bold']"));
        WebElement clearFilterLink = keyword.findElement(By.xpath(
                "//span[@class='text-link']"));
        keyword.waitForElementVisibilities(optionConditionYourSearch);
        keyword.waitForElementVisibilities(clearFilterLink);
        if (isElementDisplayed(optionConditionYourSearch) == true
                && isElementDisplayed(clearFilterLink) == true
                && isElementDisplayed(titleModuleYourSearch) == true) {
            return true;
        } else
            return false;
    }
    /**
     * Check title Page after user click on New Condition
     */
    
	public  boolean validateTitle(String expectedTitle){
    String actualTitle = driver.getTitle();
    if(actualTitle.contentEquals(expectedTitle)){
        return true;
    }
    else{
        return false;
           
    }

}
/**
 * Click on ConditionTab expanded and click on option New
 * @throws InterruptedException
 */
    public void clickOnConditionTab()throws InterruptedException{

       // keyword.scrollAndWaitToClick(conditionTab);
       // keyword.scrollAndWaitToClick1(conditionTab);
       // keyword.click(optionNew);

        keyword.scrollAndWaitToClick1(conditionTab);
        keyword.click(optionNew);
    } 


}
