package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBBasePage;



public class ModificationQuestionComponentInOptionsPage extends KBBBasePage{

    public ModificationQuestionComponentInOptionsPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    //#region Declare web objects
    private WebElement withoutModifications = keyword.findWebElementByXpath("//label[@data-testid='withoutModifications']");
    private WebElement btnNext = keyword.findWebElementByXpath("//button[@data-lean-auto='optionsNextButton']");
    //#endregion

    //#region page actions
    public void clickNoOptionInModificationsQuestion() {
        keyword.scrollAndWaitToClick(withoutModifications);
    }
    public void clickOnNextButton() throws InterruptedException {
        keyword.scrollAndWaitToPageLoad(btnNext);
    }
}
