package com.example.test.pages.KBBMOOCProject.CategoryAndStylePage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class ModelComponent extends KbbBasePage {

    public ModelComponent(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    private WebElement btnModel = keyword.findWebElementByXpath("//div[@class='model']");

    /**
     * Search and click on Model Dropdown
     */
    public void clickOnModelDropDownInMyCarValuePage() throws InterruptedException {
        keyword.clickThenWait(btnModel);
    }

    private WebElement optModel = keyword.findWebElementByXpath("//div[@class='model']//option[@value= '32913']");

    /**
     * Search and choose an option in Model Dropdown
     */
    public void clickToChooseaModelInModelDropDownInMyCarValuePage() throws InterruptedException {
        keyword.clickThenWait(optModel);
    }
}
