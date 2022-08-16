package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class OfferOptionsPage extends KbbBasePage{

    public OfferOptionsPage(WebDriver driver) {
        super(driver);
        
    }
    WebElement chkGetTrade = keyword.findWebElementByXpath("//input[@id='no']");
    WebElement chkGetACashOffer = keyword.findWebElementByXpath("//input[@id='yes']");
    WebElement divGetTrade = keyword.findWebElementByXpath("//div[text()='Get Your Trade-In & Private Party Values']");
    WebElement divGetACashOffer = keyword.findWebElementByXpath("//div[text()='Get a Cash Offer for Your Specific Vehicle']");

    public boolean optionGetTradeCannotUnCheck() {
        keyword.scrollAndWaitToClick(divGetTrade);
        if(!chkGetTrade.isSelected()){
            return false;
        }
        return true;
    }
    public boolean checkGetACashOfferCheckboxCanBeUncheck() {
        if(!chkGetACashOffer.isSelected()){
            return true;
        }
        return false;
    }
    public boolean checkGetACashOfferCheckboxCanBeCheck() {
        keyword.scrollAndWaitToClick(divGetACashOffer);
        if(chkGetACashOffer.isSelected()){
            return true;
        }
        return false;
    }
    
}
