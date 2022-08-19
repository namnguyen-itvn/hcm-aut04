package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class OfferOptionsPage extends KbbBasePage{

    public OfferOptionsPage(WebDriver driver) {
        super(driver);
        
    }
    //#region Declare web objects
    private WebElement chkGetTrade = keyword.findWebElementByXpath("//input[@id='no']");
    private WebElement chkGetACashOffer = keyword.findWebElementByXpath("//input[@id='yes']");
    private WebElement divGetTrade = keyword.findWebElementByXpath("//div[text()='Get Your Trade-In & Private Party Values']");
    private WebElement divGetACashOffer = keyword.findWebElementByXpath("//div[text()='Get a Cash Offer for Your Specific Vehicle']");
    //#endregion

    //#region page actions
    /**
     * check that option "Get Your Trade-In & Private Party Values" can not uncheck
     * @return
     */
    public boolean optionGetTradeCannotUnCheck() {
        keyword.scrollAndWaitToClick(divGetTrade);
        if(!chkGetTrade.isSelected()){
            return false;
        }
        return true;
    }

    /**
     * check that option "Get a Cash Offer for Your Specific Vehicle" can be unselect as default
     * @return
     */
    public boolean checkGetACashOfferCheckboxCanBeUncheck() {
        if(!chkGetACashOffer.isSelected()){
            return true;
        }
        return false;
    }
    /**
     * check that option "Get a Cash Offer for Your Specific Vehicle" can be check
     * @return
     */
    public boolean checkGetACashOfferCheckboxCanBeCheck(){
        keyword.scrollAndWaitToClick(divGetACashOffer);
        if(chkGetACashOffer.isSelected()){
            return true;
        }
        return false;
    }
    //#endregion
}
