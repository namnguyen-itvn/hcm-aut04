package com.example.test.pages.KBBMOOCProject.CarResearchPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class ReviewCarsDropdow extends KbbBasePage {

    public ReviewCarsDropdow(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    public void chooseTheYearOfChange() throws InterruptedException
    {
        WebElement lbChangeYear = keyword.findWebElementByXpath("//*[@class='year']//option[@value='2020']");
        keyword.scrollAndWaitToClick(lbChangeYear);
    }

    public void chooseTheMakeOfChange() throws InterruptedException
    {
        WebElement lbChangeMake = keyword.findWebElementByXpath("//select[@aria-label='Make']/option[@value='Audi']");
        keyword.scrollAndWaitToClick(lbChangeMake);
    }

    public void chooseTheModelOfChange() throws InterruptedException
    {
        WebElement lbChangeModel = keyword.findWebElementByXpath("//*[@class='model']//option[@value='A3']");
        keyword.scrollAndWaitToClick(lbChangeModel);
    }
    public void clickOnBtnGo() throws InterruptedException
    {
        WebElement btnGo=keyword.findWebElementByXpath("//button[@data-automation='submit-button']");
        keyword.scrollAndWaitToClick(btnGo);
    }
    
}
