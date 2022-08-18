package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class SelectKeyandVehicleComponent  extends KbbBasePage{

    public SelectKeyandVehicleComponent(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    
  private  WebElement selectKey = keyword.findWebElementByXpath("//div/label[@data-testid='withKeys']");
   private WebElement btnNext = keyword.findWebElementByXpath("//div/button[@data-lean-auto='optionsNextButton']");

    /**
     * @throws InterruptedException
     */
    public void actionselectKey() throws InterruptedException{
        keyword.scrollAndWaitToClick(selectKey);
        WebElement selectVehicle = keyword.findWebElementByXpath("//div/label[@data-testid='withoutModifications']");
        keyword.scrollAndWaitToClick(selectVehicle);
        keyword.click(btnNext);

    }

}
