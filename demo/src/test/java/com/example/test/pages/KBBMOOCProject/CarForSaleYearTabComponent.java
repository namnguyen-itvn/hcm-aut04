package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CarForSaleYearTabComponent extends KbbPageBase {

    public CarForSaleYearTabComponent(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

     //Declare element
     WebElement tabYear = keyword.findElementByLocator(By.xpath("//span[contains(text(), 'Year')]"));
     
     /**
     * Method verify that Year Tab is displayed Correct
     * @return true or false
     */
    public boolean isTheYearFilterShouldBeDisplayedCorrectWhenUserClickOnIt(){
        keyword.scrollToElement(tabYear);
        if (isElementDisplayed(tabYear) == true && isElementDisplayed(ddlMinimumYear) == true && 
        isElementDisplayed(ddlMaximumYear) == true)
        {
            return true;
        }
        else return false;
    }

	

    /**
     * Click on Minimumyear dropdownList
     */

    WebElement ddlMinimumYear = keyword.findElementByLocator(By.id("614960940"));
    public void clickOnMinimumDropDownList() throws InterruptedException{
        keyword.waitForPageToLoad();

        keyword.scrollAndWaitToClick(ddlMinimumYear);

    }
    /**
     * click on Maximum year dropdown list
     */

    WebElement ddlMaximumYear = keyword.findElementByLocator(By.id("2152820002"));
    public void clickOnMaximumYearDropDownListt() throws InterruptedException{

        keyword.scrollAndWaitToClick(ddlMaximumYear);
    }

    /**
     * Select Minimum year
     * @throws InterruptedException
     */
    public void clickOnSelectMinimumYear() throws InterruptedException{
        WebElement option2018mi = keyword.findWebElementByXpath("//select[@id='614960940']//option[@value='2018']");
        keyword.scrollAndWaitToClick(option2018mi);
    }
    /**
     * Select Maximum Year
     * @throws InterruptedException
     */
   
    public void clickOnSelectMaximumYear() throws InterruptedException{
        WebElement option2018max = keyword.findWebElementByXpath("//select[@id='2152820002']//option[@value='2018']");

        keyword.scrollAndWaitToClick(option2018max);
    }

}
