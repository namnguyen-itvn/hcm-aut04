package com.example.test.pages.KBBMOOCProject.CategoryAndStylePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class CategoryAndStylePage extends KbbBasePage {

    public CategoryAndStylePage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    private WebElement btnStyle = keyword.findWebElementByXpath("//div[@id='style']");

    public void clickOnStyleDropdownInCategoryAndStylePage() {

        keyword.clickThenWait(btnStyle);
    }

    private WebElement btnChoose = keyword.findWebElementByXpath("//div[@id='style']//option[@value='434546']");

    public void clickToChooseaStyleinStyleDropdownInCategoryAndStylePage() {

        keyword.clickThenWait(btnChoose);
    }

    private WebElement inputMileage = keyword.findWebElementByXpath("//input[@data-lean-auto='mileageInput']");

    public void sendKeysToMileageTextBoxInCategoryAndStylePage(String mileage) {
        keyword.sendKeys(inputMileage, mileage);
    }

    private WebElement inputZip = keyword.findWebElementByXpath("//input[@data-lean-auto='zipcodeInput']");

    public void sendKeysToZipTextBoxInCategoryAndStylePage(String zip) {
        keyword.sendKeys(inputZip, zip);
    }

}
