package com.example.test.pages.KBBMOOCProject.MyCarValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class SelectKeyandVehicleComponentPage  extends KbbBasePage{

    public SelectKeyandVehicleComponentPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    
    WebElement selectKey = keyword.findWebElementByXpath("//div/label[@data-testid='withKeys']");
    WebElement btnNext = keyword.findWebElementByXpath("//div/button[@data-lean-auto='optionsNextButton']");

    public void actionselectKey() throws InterruptedException{
        keyword.scrollAndWaitToClick(selectKey);
        WebElement selectVehicle = keyword.findWebElementByXpath("//div/label[@data-testid='withoutModifications']");
        keyword.scrollAndWaitToClick(selectVehicle);
        keyword.click(btnNext);

    }

}
